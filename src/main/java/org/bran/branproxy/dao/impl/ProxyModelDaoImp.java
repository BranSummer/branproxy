package org.bran.branproxy.dao.impl;

import org.bran.branproxy.config.Constant;
import org.bran.branproxy.dao.ProxyModelDao;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.util.Detector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ProxyModelDaoImp implements ProxyModelDao {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private Detector detector;

    @Override
    public void save(ProxyModel proxyModel) {
        redisTemplate.opsForList().rightPush(Constant.REDIS_PROXY_QUEUE, proxyModel.toJson());
    }

    @Override
    public void save(Iterable<ProxyModel> proxyModels) {
        for (ProxyModel proxyModel : proxyModels) {
            redisTemplate.opsForList().rightPush(Constant.REDIS_PROXY_QUEUE, proxyModel.toJson());
        }
    }

    @Override
    public void delete(ProxyModel proxyModel) {

    }

    @Override
    public void update(ProxyModel proxyModel, int timeout) {

    }

    @Override
    public ProxyModel pop() {
        String strModel = (String) redisTemplate.opsForList().rightPop(Constant.REDIS_PROXY_QUEUE, 5, TimeUnit.MINUTES);
        ProxyModel proxyModel = null;
        if (strModel != null) {
            proxyModel = ProxyModel.praseJson(strModel);
        }
        if(detector.isAvailable(proxyModel)){
            save(proxyModel);
            return proxyModel;
        }
        return null;
    }
}
