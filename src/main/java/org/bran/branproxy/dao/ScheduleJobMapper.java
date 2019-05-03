package org.bran.branproxy.dao;

import org.apache.ibatis.annotations.*;
import org.bran.branproxy.dto.SelectScheduleJobDto;
import org.bran.branproxy.model.ScheduleJobEntity;

import java.util.List;
import java.util.Map;

/**
 * @author lizhle
 */
@Mapper
public interface ScheduleJobMapper {


    /**
     *
     * @param dto SelectScheduleJobDto
     * @return
     */
    List<ScheduleJobEntity> queryList(SelectScheduleJobDto dto);

    @Select("select * from schedule_job")
    List<ScheduleJobEntity> queryAll();


    /**
     *
     * @param dto
     * @return
     */
    int queryTotal(SelectScheduleJobDto dto);

    /**
     * 更新状态
     *
     * @param status
     * @param jobId
     */
    @Update("update schedule_job set status = #{status} where job_id=#{jobId}")
    void updateStatus(@Param("status") int status, @Param("jobId") Long jobId);

    /**
     * 详情
     *
     * @param jobId
     * @return
     */
    @Select("select * from schedule_job where job_id=#{jobId}")
    ScheduleJobEntity selectById(@Param("jobId") Long jobId);

    /**
     * 新增
     *
     * @param entity
     * @return
     */
    void insert(ScheduleJobEntity entity);

    /**
     * 删除
     *
     * @param jobId
     */
    @Delete("delete from schedule_job where job_id=#{jobId}")
    void delete(@Param("jobId") Long jobId);

    /**
     * 更新
     *
     * @param entity
     */
    void update(ScheduleJobEntity entity);


}
