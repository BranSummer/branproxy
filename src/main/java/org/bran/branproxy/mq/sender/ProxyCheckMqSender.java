package org.bran.branproxy.mq.sender;

import org.bran.branproxy.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Component
public class ProxyCheckMqSender {

    @Resource
    private RabbitTemplate rabbitTemplate;

    public void pubMessage(){
        // TODO
        rabbitTemplate.convertAndSend(RabbitMqConfig.PROXY_CHECK_EXCHANGE,"","");
    }

}
