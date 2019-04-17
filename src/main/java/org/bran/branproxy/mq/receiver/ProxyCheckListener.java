package org.bran.branproxy.mq.receiver;

import org.bran.branproxy.config.RabbitMqConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author lizhle
 */
@Component
@RabbitListener(queues = RabbitMqConfig.PROXY_CHECK_QUEUE)
public class ProxyCheckListener {

    @RabbitHandler
    public void proxyCheck(){
        // TODO
    }
}
