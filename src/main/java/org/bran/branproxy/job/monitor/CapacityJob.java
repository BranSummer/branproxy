package org.bran.branproxy.job.monitor;

import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.vo.charts.CapacityVo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @author lizhle
 */
@Component
@EnableScheduling
@Slf4j
public class CapacityJob {

    private static final Random RANDOM = new Random();

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(fixedDelay = 1000)
    public void pubCapacityMessage(){
        LocalDateTime now = LocalDateTime.now();
        CapacityVo capacityVo = new CapacityVo();
        capacityVo.setDate(now.format(formatter));

        capacityVo.setCapacity(RANDOM.nextInt(100)+500);
        simpMessagingTemplate.convertAndSend("/dashboard",capacityVo);
    }
}
