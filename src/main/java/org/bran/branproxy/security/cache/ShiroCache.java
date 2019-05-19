package org.bran.branproxy.security.cache;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.bran.branproxy.security.config.ShiroConfig.SESSION_TIMEOUT_IN_SECONDS;
import static org.bran.branproxy.security.config.ShiroConfig.SHIRO_CACHE_KEY;

/**
 * @author lizhle
 */
@Slf4j
@SuppressWarnings("unchecked")
public class ShiroCache<K, V> implements Cache<K, V> {

    private String cacheKey;
    private RedisTemplate<K, V> shiroRedisTemplate;

    public ShiroCache(String name, RedisTemplate client) {
        this.cacheKey = SHIRO_CACHE_KEY + name + ":";
        this.shiroRedisTemplate = client;
    }

    @Override
    public V get(K key) throws CacheException {
        shiroRedisTemplate.boundValueOps(getCacheKey(key)).expire(SESSION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
        return shiroRedisTemplate.boundValueOps(getCacheKey(key)).get();
    }

    @Override
    public V put(K key, V value) throws CacheException {
        V old = get(key);
        shiroRedisTemplate.boundValueOps(getCacheKey(key)).set(value);
        shiroRedisTemplate.expire(getCacheKey(key), SESSION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
        return old;
    }

    @Override
    public V remove(K key) throws CacheException {
        V old = get(key);
        shiroRedisTemplate.delete(getCacheKey(key));
        return old;
    }

    @Override
    public void clear() throws CacheException {
        shiroRedisTemplate.delete(keys());
    }

    @Override
    public int size() {
        return keys().size();
    }

    @Override
    public Set<K> keys() {
        return shiroRedisTemplate.keys(getCacheKey("*"));
    }

    @Override
    public Collection<V> values() {
        Set<K> set = keys();
        List<V> list = new ArrayList<>();
        for (K s : set) {
            list.add(get(s));
        }
        return list;
    }

    private K getCacheKey(Object k) {
        return (K) (this.cacheKey + k);
    }

}