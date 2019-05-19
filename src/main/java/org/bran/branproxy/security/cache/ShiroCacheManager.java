package org.bran.branproxy.security.cache;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
public class ShiroCacheManager implements CacheManager {

    @Resource
    private RedisTemplate<String, Object> shiroRedisTemplate;

    @Override
    public <K, V> Cache<K, V> getCache(String name) throws CacheException {
        return new ShiroCache<>(name, shiroRedisTemplate);
    }

    public RedisTemplate<String, Object> getShiroRedisTemplate() {
        return shiroRedisTemplate;
    }

    public void setShiroRedisTemplate(RedisTemplate<String, Object> shiroRedisTemplate) {
        this.shiroRedisTemplate = shiroRedisTemplate;
    }
}
