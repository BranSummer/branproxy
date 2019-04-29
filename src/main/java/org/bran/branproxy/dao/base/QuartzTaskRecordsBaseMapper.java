package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.QuartzTaskRecords;
/**
*  @author bran
*/
public interface QuartzTaskRecordsBaseMapper {

    int insertQuartzTaskRecords(QuartzTaskRecords object);

    int updateQuartzTaskRecords(QuartzTaskRecords object);

    int update(QuartzTaskRecords.UpdateBuilder object);

    List<QuartzTaskRecords> queryQuartzTaskRecords(QuartzTaskRecords object);

    QuartzTaskRecords queryQuartzTaskRecordsLimit1(QuartzTaskRecords object);

}