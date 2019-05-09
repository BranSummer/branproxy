package org.bran.branproxy.job.monitor;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.vo.charts.CapacityVo;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * @author lizhle
 */
@Component
@Slf4j
public class CapacityMonitor {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Resource
    private IpProxyModelMapper ipProxyModelMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;

    public void pubCapacityMessage() {
        LocalDateTime now = LocalDateTime.now();
        CapacityVo capacityVo = new CapacityVo();
        capacityVo.setDate(now.format(FORMATTER));
        capacityVo.setCapacity(ipProxyModelMapper.countTotal());
        simpMessagingTemplate.convertAndSend("/dashboard", capacityVo);
    }

    public void pubCapacity(String json) {
        JSONObject jsonObject = JSONObject.parseObject(json);
        String redisKey = (String)jsonObject.get("redisKey");
        String wsDestination = (String)jsonObject.get("wsDestination");
        CapacityVo vo = getCapacityVoFromRedis(redisKey);
        simpMessagingTemplate.convertAndSend(wsDestination,vo);
    }

    private CapacityVo getCapacityVoFromRedis(String redisKey) {
        Long size = stringRedisTemplate.opsForList().size(redisKey);
        if (Objects.isNull(size)) {
            size = 0L;
        }
        LocalDateTime now = LocalDateTime.now();
        CapacityVo vo = new CapacityVo();
        vo.setDate(now.format(FORMATTER));
        vo.setCapacity(size.intValue());
        return vo;
    }

}
