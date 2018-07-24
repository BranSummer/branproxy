package org.bran.branproxy.dao;

import org.bran.branproxy.config.Constant;
import org.bran.branproxy.dao.ProxyModelDao;
import org.bran.branproxy.model.ProxyModel;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProxyModelDaoImp implements ProxyModelDao {

    RedisTemplate redisTemplate;

    @Override
    public void save(ProxyModel proxyModel) {
        redisTemplate.opsForList().rightPush(Constant.REDIS_PROXY_QUEUE,proxyModel.toJson());
    }

    @Override
    public void save(Iterable<ProxyModel> proxyModels) {
        for(ProxyModel proxyModel: proxyModels){
            redisTemplate.opsForList().rightPush(Constant.REDIS_PROXY_QUEUE,proxyModel.toJson());
        }
    }

    @Override
    public void delete(ProxyModel proxyModel) {

    }

    @Override
    public void update(ProxyModel proxyModel, int timeout) {

    }

    @Override
    public ProxyModel getTop() {
        return null;
    }
}
