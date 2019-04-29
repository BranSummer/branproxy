package org.bran.branproxy.controller;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.monitor.ResetMqConsumersDto;
import org.bran.branproxy.job.monitor.CheckMqMonitor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@RestController
@RequestMapping("/monitor")
public class MonitorController {

    @Resource
    private CheckMqMonitor checkMqMonitor;

    @GetMapping("/mqStats")
    public ResultResponse mqStatus(){
        return ResultResponse.buildSuccess(checkMqMonitor.statAllMessageQueueDetail());
    }

    @PostMapping("/resetMqConsumer")
    public ResultResponse resetConsumer(@RequestBody ResetMqConsumersDto dto){
        checkMqMonitor.resetQueueConcurrentConsumers(dto.getQueueName(),dto.getConsumerCount());
        return ResultResponse.buildSuccess();
    }
}
