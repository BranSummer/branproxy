package org.bran.branproxy.security.cache;

import org.bran.branproxy.security.config.ShiroSessionSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author lizhle
 */
@Configuration
public class ShiroCacheConfig {

    /**
     * shiro专用的redisTemplate, value序列化器使用{@link ShiroSessionSerializer}
     *
     * @param factory redis工厂
     */
    @Bean
    @Autowired
    public RedisTemplate<String, Object> shiroRedisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        // value使用自定义序列器
        redisTemplate.setValueSerializer(new ShiroSessionSerializer());
        return redisTemplate;
    }
}
