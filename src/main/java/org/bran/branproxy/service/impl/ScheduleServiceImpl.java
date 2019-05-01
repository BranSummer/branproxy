package org.bran.branproxy.service.impl;

import org.bran.branproxy.common.enums.ScheduleStatus;
import org.bran.branproxy.dao.ScheduleJobMapper;
import org.bran.branproxy.model.ScheduleJobEntity;
import org.bran.branproxy.service.IScheduleService;
import org.bran.branproxy.util.job.ScheduleUtils;
import org.bran.branproxy.vo.PageExtVo;
import org.quartz.CronTrigger;
import org.quartz.Scheduler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author lizhle
 */
@Service
@Transactional
public class ScheduleServiceImpl implements IScheduleService {

    @Resource
    private ScheduleJobMapper scheduleJobMapper;
    @Resource
    private Scheduler scheduler;

    /**
     * 项目启动时，初始化定时器
     */
    @PostConstruct
    public void init() {
        List<ScheduleJobEntity> scheduleJobList = scheduleJobMapper.queryList();
        scheduleJobList.forEach(scheduleJob -> {
            CronTrigger cronTrigger = ScheduleUtils.getCronTrigger(scheduler, scheduleJob.getJobId());
            //如果不存在，则创建
            if (cronTrigger == null) {
                ScheduleUtils.createScheduleJob(scheduler, scheduleJob);
            } else {
                ScheduleUtils.updateScheduleJob(scheduler, scheduleJob);
            }
        });
    }

    @Override
    public PageExtVo<ScheduleJobEntity> queryList(Map<String, Object> map) {
        System.out.println(map);
        int totalCount = scheduleJobMapper.queryTotal(map);
        if (totalCount == 0) {
            return new PageExtVo<>();
        }
        List<ScheduleJobEntity> scheduleJobList = scheduleJobMapper.queryList();
        PageExtVo vo = new PageExtVo();
        vo.setCount(totalCount);
        vo.setList(scheduleJobList);
        vo.setPageSize(Integer.parseInt((String) map.get("limit")));
        vo.setCurrPage(Integer.parseInt((String) map.get("page")));
        return vo;
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return scheduleJobMapper.queryTotal(map);
    }

    @Override
    public void run(Long jobId) {
        ScheduleUtils.run(scheduler, scheduleJobMapper.selectById(jobId));
    }

    @Override
    public void pause(Long jobId) {
        ScheduleUtils.pauseJob(scheduler, jobId);
        scheduleJobMapper.updateStatus(ScheduleStatus.PAUSE.getValue(), jobId);
    }

    @Override
    public void resume(Long jobId) {
        ScheduleUtils.resumeJob(scheduler, jobId);
        scheduleJobMapper.updateStatus(ScheduleStatus.NORMAL.getValue(), jobId);
    }

    @Override
    public void save(ScheduleJobEntity entity) {
        entity.setStatus(ScheduleStatus.NORMAL.getValue());
        entity.setCreateTime(new Date());
        scheduleJobMapper.insert(entity);
        System.out.println(entity);
//        ScheduleUtils.createScheduleJob(scheduler, entity);
    }

    @Override
    public void delete(Long jobId) {
        ScheduleUtils.deleteScheduleJob(scheduler, jobId);
        scheduleJobMapper.delete(jobId);
    }

    @Override
    public void update(ScheduleJobEntity entity) {
        ScheduleUtils.updateScheduleJob(scheduler,entity);
        scheduleJobMapper.update(entity);
    }
}
