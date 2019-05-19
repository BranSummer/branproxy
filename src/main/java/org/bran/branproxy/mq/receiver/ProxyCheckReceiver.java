package org.bran.branproxy.mq.receiver;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.common.RedisConstants;
import org.bran.branproxy.config.RabbitMqConfig;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.mq.payload.CheckPayload;
import org.bran.branproxy.service.IAsyncService;
import org.bran.branproxy.util.DetectUtil;
import org.bran.branproxy.util.JsonUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author lizhle
 */

@Data
@Slf4j
@RabbitListener(queues = RabbitMqConfig.PROXY_CHECK_QUEUE)
public class ProxyCheckReceiver {

    @Resource
    private ProxyModelMapper proxyModelMapper;
    @Resource
    private DetectUtil detectUtil;
    @Resource
    private IpProxyModelMapper ipProxyModelMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private IAsyncService asyncService;


    @RabbitHandler
    public void receiveHandler(CheckPayload payload) {
        asyncService.executeInvoke(()->proxyCheck(payload));
    }

    @Transactional(rollbackFor = Exception.class, timeout = 20)
    public void proxyCheck(CheckPayload payload) {
        if (Objects.isNull(payload)) {
            return;
        }
        try {
            int timeout = detectUtil.detect(payload.getIpProxyModel(), payload.getDestination());
            if (timeout > 0) {
                ProxyModel proxyModel = new ProxyModel();
                BeanUtils.copyProperties(payload.getIpProxyModel(), proxyModel);
                proxyModel.setTimeout(timeout);
                proxyModel.setLastUpdateTime(LocalDateTime.now());
                // 更新到数据库
                /*ipProxyModelMapper.update(IpProxyModel.UpdateBuild()
                        .set(IpProxyModel.Build().timeout(timeout).build())
                        .where(IpProxyModel.ConditionBuild().idList(payload.getIpProxyModel().getId()).build())
                        .build());*/
                // push 到redis
                stringRedisTemplate.opsForList().remove(payload.getRedisKey(), 0, JsonUtil.toJson(proxyModel));
                stringRedisTemplate.opsForList().rightPush(payload.getRedisKey(), JsonUtil.toJson(proxyModel));
            }
            stringRedisTemplate.opsForValue().increment(payload.getRedisKey()+ RedisConstants.RATE_TMP,1);
        } catch (Exception e) {
            log.error(e.getMessage());
        }


    }
}
