package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.RoleModel;
/**
*  @author bran
*/
public interface RoleModelBaseMapper {

    int insertRoleModel(RoleModel object);

    int updateRoleModel(RoleModel object);

    int update(RoleModel.UpdateBuilder object);

    List<RoleModel> queryRoleModel(RoleModel object);

    RoleModel queryRoleModelLimit1(RoleModel object);

}