package org.bran.branproxy.job.check;

import com.alibaba.fastjson.JSONObject;
import org.bran.branproxy.common.RedisConstants;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.mq.payload.CheckPayload;
import org.bran.branproxy.mq.sender.MqSender;
import org.bran.branproxy.util.DetectUtil;
import org.bran.branproxy.util.JsonUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lizhle
 */
@Component
public class CheckTask {

    @Resource
    private IpProxyModelMapper ipProxyModelMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private MqSender mqSender;

    public void checkProxy(IpProxyModel ipProxyModel){
        CheckPayload payload = new CheckPayload();
        payload.setRedisKey(RedisConstants.REDIS_PROXY_QUEUE);
        payload.setDestination(DetectUtil.BAIDU_URL);
        payload.setIpProxyModel(ipProxyModel);
        mqSender.pubCheckMessage(payload);
    }

    public void recovreyProxy(String json){
        CheckPayload payload = getCheckPayLoadFromParam(json);
        List<IpProxyModel> list = ipProxyModelMapper.selectAll();
        list.forEach(e->{
            payload.setIpProxyModel(e);
            mqSender.pubCheckMessage(payload);
        });
    }

    public void recheckProxy(String json){
        CheckPayload payload = getCheckPayLoadFromParam(json);
        String proxyJson = stringRedisTemplate.opsForList().leftPop(payload.getRedisKey());
        IpProxyModel proxyModel = JsonUtil.parseJson(proxyJson,IpProxyModel.class);
        payload.setIpProxyModel(proxyModel);
        mqSender.pubCheckMessage(payload);
    }

    private CheckPayload getCheckPayLoadFromParam(String paramJson){
        JSONObject map = JSONObject.parseObject(paramJson);
        CheckPayload payload = new CheckPayload();
        payload.setDestination((String)map.get("destination"));
        payload.setRedisKey((String)map.get("redisKey"));
        return payload;
    }

}
