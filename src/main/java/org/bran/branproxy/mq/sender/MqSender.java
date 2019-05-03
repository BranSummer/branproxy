package org.bran.branproxy.mq.sender;

import org.bran.branproxy.config.RabbitMqConfig;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.mq.payload.CheckPayload;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Component
public class MqSender {

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void pubCheckMessage(CheckPayload payload){
        rabbitTemplate.convertAndSend(RabbitMqConfig.PROXY_CHECK_EXCHANGE,null,payload);
    }

}
