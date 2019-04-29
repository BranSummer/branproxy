package org.bran.branproxy.job.monitor;

import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.vo.monitor.MqDetailVo;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistry;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
@Component
public class CheckMqMonitor {

    private static final String CONTAINER_NOT_EXISTS = "消息队列%s对应的监听容器不存在！";

    @Resource
    private RabbitListenerEndpointRegistry rabbitListenerEndpointRegistry;

    /**
     * queue2ContainerAllMap初始化标识
     */
    private volatile boolean hasInit = false;

    /**
     * 所有的队列监听容器Map
     */
    private final Map<String, SimpleMessageListenerContainer> allQueue2ContainerMap = new ConcurrentHashMap<>();

    /**
     * 重置消息队列并发消费者数量
     * @param queueName
     * @param concurrentConsumers must greater than zero
     * @return
     */
    public boolean resetQueueConcurrentConsumers(String queueName, int concurrentConsumers) {
        Assert.state(concurrentConsumers > 0, "参数 'concurrentConsumers' 必须大于0.");
        SimpleMessageListenerContainer container = findContainerByQueueName(queueName);
        if (container.isActive() && container.isRunning()) {
            container.setConcurrentConsumers(concurrentConsumers);
            return true;
        }
        return false;
    }

    /**
     * 重启对消息队列的监听
     * @param queueName
     * @return
     */
    public boolean restartMessageListener(String queueName) {
        SimpleMessageListenerContainer container = findContainerByQueueName(queueName);
        Assert.state(!container.isRunning(), String.format("消息队列%s对应的监听容器正在运行！", queueName));
        container.start();
        return true;
    }

    /**
     * 停止对消息队列的监听
     * @param queueName
     * @return
     */
    public boolean stopMessageListener(String queueName) {
        SimpleMessageListenerContainer container = findContainerByQueueName(queueName);
        Assert.state(container.isRunning(), String.format("消息队列%s对应的监听容器未运行！", queueName));
        container.stop();
        return true;
    }

    /**
     * 统计队列详情
     * @return
     */
    public List<MqDetailVo> statAllMessageQueueDetail() {
        Map<String, SimpleMessageListenerContainer> queueContainerMap = getQueue2ContainerAllMap();
        return queueContainerMap.keySet().stream().map(queueName -> {
            MqDetailVo vo = new MqDetailVo();
            vo.setQueueName(queueName);
            SimpleMessageListenerContainer container = queueContainerMap.get(queueName);
            vo.setActiveConsumerCount(container.getActiveConsumerCount());
            vo.setActiveContainer(container.isActive());
            vo.setRunning(container.isRunning());
            vo.setContainerIdentity(ObjectUtils.getIdentityHexString(container));
            return vo;
        }).collect(Collectors.toList());
    }

    /**
     * 根据队列名查找消息监听容器
     * @param queueName
     * @return
     */
    private SimpleMessageListenerContainer findContainerByQueueName(String queueName) {
        String key = StringUtils.trim(queueName);
        SimpleMessageListenerContainer container = getQueue2ContainerAllMap().get(key);
        Assert.notNull(container, String.format(CONTAINER_NOT_EXISTS, key));
        return container;
    }

    private Map<String, SimpleMessageListenerContainer> getQueue2ContainerAllMap() {
        if (!hasInit) {
            synchronized (allQueue2ContainerMap) {
                if (!hasInit) {
                    rabbitListenerEndpointRegistry.getListenerContainers().forEach(container -> {
                        SimpleMessageListenerContainer simpleContainer = (SimpleMessageListenerContainer) container;
                        Arrays.stream(simpleContainer.getQueueNames()).forEach(queueName ->
                                allQueue2ContainerMap.putIfAbsent(StringUtils.trim(queueName), simpleContainer));
                    });
                    hasInit = true;
                }
            }
        }
        return allQueue2ContainerMap;
    }


}
