package org.bran.branproxy.job.monitor;

import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.vo.charts.CapacityVo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author lizhle
 */
@Component
@EnableScheduling
@Slf4j
public class CapacityJob {

    @Resource
    private IpProxyModelMapper ipProxyModelMapper;

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(fixedDelay = 10000)
    public void pubCapacityMessage(){
        LocalDateTime now = LocalDateTime.now();
        CapacityVo capacityVo = new CapacityVo();
        capacityVo.setDate(now.format(FORMATTER));
        capacityVo.setCapacity(ipProxyModelMapper.countTotal());
        simpMessagingTemplate.convertAndSend("/dashboard",capacityVo);
    }
}
