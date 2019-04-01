package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.ResourceType;
/**
*  @author bran
*/
public interface ResourceTypeBaseMapper {

    int insertResourceType(ResourceType object);

    int updateResourceType(ResourceType object);

    int update(ResourceType.UpdateBuilder object);

    List<ResourceType> queryResourceType(ResourceType object);

    ResourceType queryResourceTypeLimit1(ResourceType object);

}