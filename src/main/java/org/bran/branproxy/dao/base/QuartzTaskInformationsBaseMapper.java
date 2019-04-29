package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.QuartzTaskInformations;
/**
*  @author bran
*/
public interface QuartzTaskInformationsBaseMapper {

    int insertQuartzTaskInformations(QuartzTaskInformations object);

    int updateQuartzTaskInformations(QuartzTaskInformations object);

    int update(QuartzTaskInformations.UpdateBuilder object);

    List<QuartzTaskInformations> queryQuartzTaskInformations(QuartzTaskInformations object);

    QuartzTaskInformations queryQuartzTaskInformationsLimit1(QuartzTaskInformations object);

}