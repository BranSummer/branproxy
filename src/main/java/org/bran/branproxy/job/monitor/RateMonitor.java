package org.bran.branproxy.job.monitor;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.common.RedisConstants;
import org.bran.branproxy.util.JsonUtil;
import org.bran.branproxy.vo.charts.CapacityVo;
import org.bran.branproxy.vo.charts.RateVo;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;
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


    public void pubTmpRate(String jsonStr){
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);
        String redisKey = (String)jsonObject.get("redisKey");
        String wsDestination = (String)jsonObject.get("wsDestination");
        RateVo vo = getRateVoFromRedis(redisKey);
        simpMessagingTemplate.convertAndSend(wsDestination,vo);
    }

    public void pubRateMessage(String redisKey) {
        RateVo vo = getRateVoFromRedis(redisKey);
        stringRedisTemplate.opsForList().rightPush(redisKey + RedisConstants.RATE_LIST, JsonUtil.toJson(vo));
        Long listSize = stringRedisTemplate.opsForList().size(redisKey + RedisConstants.RATE_LIST);
        if(Objects.isNull(listSize)){
            listSize = 0L;
        }
        if (listSize > 16) {
            stringRedisTemplate.opsForList().leftPop(redisKey + RedisConstants.RATE_LIST);
        }
        stringRedisTemplate.opsForValue().getAndSet(redisKey+RedisConstants.RATE_TMP,"0");
        List<String> rateStrs = stringRedisTemplate.opsForList()
                .range(redisKey+RedisConstants.RATE_LIST,0,-1);
        List<RateVo> voList = rateStrs.stream().map(e-> JsonUtil.parseJson(e,RateVo.class)).collect(Collectors.toList());
        // 推送到websocket的c端
        simpMessagingTemplate.convertAndSend("/checkRate",voList);
    }

    private RateVo getRateVoFromRedis(String redisKey){
        String countStr = stringRedisTemplate.opsForValue().get(redisKey + RedisConstants.RATE_TMP);
        int count;
        if(StringUtils.isBlank(countStr)){
            count = 0;
        }
        count = Integer.parseInt(countStr);
        LocalDateTime now = LocalDateTime.now();
        RateVo vo = new RateVo();
        vo.setDate(now.format(FORMATTER));
        vo.setCount(count);
        return vo;
    }
}
