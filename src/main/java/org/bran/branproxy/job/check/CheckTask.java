package org.bran.branproxy.job.check;

import com.alibaba.fastjson.JSONObject;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.mq.payload.CheckPayload;
import org.bran.branproxy.mq.sender.MqSender;
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

    public void checkProxy(String json){
        JSONObject map = JSONObject.parseObject(json);
        CheckPayload payload = new CheckPayload();
        payload.setDestination((String)map.get("destination"));
        payload.setRedisKey((String)map.get("redisKey"));
        List<IpProxyModel> list = ipProxyModelMapper.selectAll();
        list.forEach(e->{
            payload.setIpProxyModel(e);
            mqSender.pubCheckMessage(payload);
        });
    }

    public void recheckProxy(String json){
        JSONObject map = JSONObject.parseObject(json);
        CheckPayload payload = new CheckPayload();
        payload.setDestination((String)map.get("destination"));
        payload.setRedisKey((String)map.get("redisKey"));
        String proxyJson = stringRedisTemplate.opsForList().leftPop((String)map.get("redisKey"));
        // TODO
    }

}
