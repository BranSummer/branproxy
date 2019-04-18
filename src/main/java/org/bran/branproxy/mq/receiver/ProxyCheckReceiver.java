package org.bran.branproxy.mq.receiver;

import lombok.Data;
import org.bran.branproxy.config.RabbitMqConfig;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.service.IAsyncService;
import org.bran.branproxy.util.DetectUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lizhle
 */

@Data
@RabbitListener(queues = RabbitMqConfig.PROXY_CHECK_QUEUE)
public class ProxyCheckReceiver {

    @Resource
    private ProxyModelMapper proxyModelMapper;
    @Resource
    private DetectUtil detectUtil;

    @RabbitHandler
    public void proxyCheck(ProxyModel proxyModel){
        int timeout = detectUtil.detect(proxyModel);
        proxyModelMapper.update(ProxyModel.UpdateBuild()
                .set(ProxyModel.Build().timeout(timeout).build())
                .where(ProxyModel.ConditionBuild().idList(proxyModel.getId()).build()));
    }
}
