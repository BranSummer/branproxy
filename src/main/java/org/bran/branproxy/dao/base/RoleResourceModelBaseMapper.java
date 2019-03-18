package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.RoleResourceModel;
/**
*  @author bran
*/
public interface RoleResourceModelBaseMapper {

    int insertRoleResourceModel(RoleResourceModel object);

    int updateRoleResourceModel(RoleResourceModel object);

    int update(RoleResourceModel.UpdateBuilder object);

    List<RoleResourceModel> queryRoleResourceModel(RoleResourceModel object);

    RoleResourceModel queryRoleResourceModelLimit1(RoleResourceModel object);

}