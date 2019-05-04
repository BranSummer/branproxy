package org.bran.branproxy.config;

import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.mq.receiver.ProxyCheckReceiver;
import org.bran.branproxy.util.DetectUtil;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author lizhle
 */
@Configuration
public class RabbitMqConfig {


    public static final String PROXY_CHECK_QUEUE = "queue.proxy_check.message";

    public static final String PROXY_CHECK_EXCHANGE = "exchange.fanout.proxy_check.message";

    @Bean
    public Queue proxyCheckQueue() {
        return new Queue(PROXY_CHECK_QUEUE, false);
    }

    @Bean
    public FanoutExchange proxyCheckExchange() {
        return new FanoutExchange(PROXY_CHECK_EXCHANGE);
    }

    @Bean
    public Binding bindCheckExchange(Queue proxyCheckQueue, FanoutExchange proxyCheckExchange) {
        return BindingBuilder.bind(proxyCheckQueue).to(proxyCheckExchange);
    }

    @Bean
    public ProxyCheckReceiver proxyCheckReceiverA() {
        return new ProxyCheckReceiver();
    }

   /* @Bean
    public ProxyCheckReceiver proxyCheckReceiverB() {
        return new ProxyCheckReceiver();
    }

    @Bean
    public ProxyCheckReceiver proxyCheckReceiverC() {
        return new ProxyCheckReceiver();
    }

    @Bean
    public ProxyCheckReceiver proxyCheckReceiverD() {
        return new ProxyCheckReceiver();
    }

    @Bean
    public ProxyCheckReceiver proxyCheckReceiverE() {
        return new ProxyCheckReceiver();
    }*/
}
