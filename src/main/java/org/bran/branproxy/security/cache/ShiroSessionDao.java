package org.bran.branproxy.security.cache;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.EnterpriseCacheSessionDAO;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import static org.bran.branproxy.security.config.ShiroConfig.REDIS_SESSION_KEY;
import static org.bran.branproxy.security.config.ShiroConfig.SESSION_TIMEOUT_IN_SECONDS;

/**
 * @author lizhle
 */
@Slf4j
public class ShiroSessionDao extends EnterpriseCacheSessionDAO {

    @Resource
    private RedisTemplate<String, Object> shiroRedisTemplate;

    /**
     * 创建session
     *
     * @param session 用户session
     * @return sessionId
     */
    @Override
    protected Serializable doCreate(Session session) {
        log.info("redisSessionDao.doCreate: {}", session);
        Serializable sessionId = super.doCreate(session);
        shiroRedisTemplate.opsForValue().set(REDIS_SESSION_KEY + sessionId.toString(), session,
                SESSION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
        return sessionId;
    }

    /**
     * 获取session
     *
     * @param sessionId sessionId
     * @return session
     */
    @Override
    protected Session doReadSession(Serializable sessionId) {
        Session session = super.doReadSession(sessionId);
        if (session == null) {
            session = (Session) shiroRedisTemplate.opsForValue().get(REDIS_SESSION_KEY + sessionId.toString());
        }
        return session;
    }

    /**
     * 更新session
     *
     * @param session session
     */
    @Override
    protected void doUpdate(Session session) {
        log.info("redisSessionDao.doUpdate: {}", session);
        super.doUpdate(session);
        String key = REDIS_SESSION_KEY + session.getId().toString();
        if (!shiroRedisTemplate.hasKey(key)) {
            shiroRedisTemplate.opsForValue().set(key, session);
        }
        shiroRedisTemplate.expire(key, SESSION_TIMEOUT_IN_SECONDS, TimeUnit.SECONDS);
    }

    /**
     * 删除session
     *
     * @param session session
     */
    @Override
    protected void doDelete(Session session) {
        log.info("redisSessionDao.doDelete: {}", session);
        super.doDelete(session);
        shiroRedisTemplate.delete(REDIS_SESSION_KEY + session.getId().toString());
    }
}
