package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.ResourceModel;
/**
*  @author bran
*/
public interface ResourceModelBaseMapper {

    int insertResourceModel(ResourceModel object);

    int updateResourceModel(ResourceModel object);

    int update(ResourceModel.UpdateBuilder object);

    List<ResourceModel> queryResourceModel(ResourceModel object);

    ResourceModel queryResourceModelLimit1(ResourceModel object);

}