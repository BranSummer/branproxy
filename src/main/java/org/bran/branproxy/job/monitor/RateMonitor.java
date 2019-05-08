package org.bran.branproxy.job.monitor;

import com.alibaba.fastjson.JSONObject;
import org.bran.branproxy.common.RedisConstants;
import org.bran.branproxy.util.JsonUtil;
import org.bran.branproxy.vo.charts.RateVo;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
@Component
public class RateMonitor {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;


    public void pubRateMessage(String redisKey) {
        int count = Integer.parseInt(stringRedisTemplate.opsForValue().get(redisKey + RedisConstants.RATE_TMP));
        //push 到速率队列队尾
        LocalDateTime now = LocalDateTime.now();
        RateVo vo = new RateVo();
        vo.setDate(now.format(FORMATTER));
        vo.setCount(count);
        stringRedisTemplate.opsForList().rightPush(redisKey + RedisConstants.RATE_LIST, JsonUtil.toJson(vo));
        long listSize = stringRedisTemplate.opsForList().size(redisKey + RedisConstants.RATE_LIST);
        if (listSize <= 10) {
            stringRedisTemplate.opsForList().leftPop(redisKey + RedisConstants.RATE_LIST);
        }
        stringRedisTemplate.opsForValue().getAndSet(redisKey+RedisConstants.RATE_TMP,"0");
        List<String> rateStrs = stringRedisTemplate.opsForList()
                .range(redisKey+RedisConstants.RATE_LIST,0,-1);
        List<RateVo> voList = rateStrs.stream().map(e-> JsonUtil.praseJson(e,RateVo.class)).collect(Collectors.toList());
        // 推送到websocket的c端
        simpMessagingTemplate.convertAndSend("",voList);
    }
}
