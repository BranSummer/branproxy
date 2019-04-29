package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.QuartzTaskErrors;
/**
*  @author bran
*/
public interface QuartzTaskErrorsBaseMapper {

    int insertQuartzTaskErrors(QuartzTaskErrors object);

    int updateQuartzTaskErrors(QuartzTaskErrors object);

    int update(QuartzTaskErrors.UpdateBuilder object);

    List<QuartzTaskErrors> queryQuartzTaskErrors(QuartzTaskErrors object);

    QuartzTaskErrors queryQuartzTaskErrorsLimit1(QuartzTaskErrors object);

}