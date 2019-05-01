package org.bran.branproxy.service;

import org.bran.branproxy.model.ScheduleJobEntity;
import org.bran.branproxy.vo.PageExtVo;

import java.util.Map;

/**
 * @author lizhle
 */
public interface IScheduleService {

    PageExtVo queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void run(Long jobId);

    void pause(Long jobId);

    void resume(Long jobId);

    void save(ScheduleJobEntity entity);

    void delete(Long jobId);

    void update(ScheduleJobEntity entity);
}
