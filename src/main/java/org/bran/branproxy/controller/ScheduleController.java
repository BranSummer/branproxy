package org.bran.branproxy.controller;

import org.bran.branproxy.common.enums.ScheduleStatus;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.model.ScheduleJobEntity;
import org.bran.branproxy.service.IScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author lizhle
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {

    @Resource
    private IScheduleService scheduleService;

    @GetMapping("/list")
    public ResultResponse listJob(@RequestParam Map<String, Object> params){
        return ResultResponse.buildSuccess(scheduleService.queryList(params));
    }


    @GetMapping("info/{jobId}")
    public ResultResponse info(@PathVariable Long jobId){
        return null;
    }

    @PostMapping("/save")
    public ResultResponse save(@RequestBody ScheduleJobEntity entity){
        scheduleService.save(entity);
        return ResultResponse.buildSuccess();
    }

    @PatchMapping("/update")
    public ResultResponse update(@RequestBody ScheduleJobEntity entity){
        scheduleService.update(entity);
        return ResultResponse.buildSuccess();
    }

    @DeleteMapping("/delete")
    public ResultResponse delete(Long jobId){
        scheduleService.delete(jobId);
        return ResultResponse.buildSuccess();
    }

    @PostMapping("/run")
    public ResultResponse run(Long jobId){
        scheduleService.run(jobId);
        return ResultResponse.buildSuccess();
    }

    @PostMapping("/pause")
    public ResultResponse pause(Long jobId){
        scheduleService.pause(jobId);
        return ResultResponse.buildSuccess();
    }

    @PostMapping("/resume")
    public ResultResponse resume(Long jobId){
        scheduleService.resume(jobId);
        return ResultResponse.buildSuccess();
    }
}
