package org.bran.branproxy.service;

import org.bran.branproxy.dto.SelectScheduleJobDto;
import org.bran.branproxy.model.ScheduleJobEntity;
import org.bran.branproxy.vo.PageExtVo;


/**
 * @author lizhle
 */
public interface IScheduleService {

    PageExtVo queryList(SelectScheduleJobDto dto);

    int queryTotal(SelectScheduleJobDto dto);

    void run(Long jobId);

    void pause(Long jobId);

    void resume(Long jobId);

    void save(ScheduleJobEntity entity);

    void delete(Long jobId);

    void update(ScheduleJobEntity entity);

    ScheduleJobEntity jobDetail(Long id);
}
