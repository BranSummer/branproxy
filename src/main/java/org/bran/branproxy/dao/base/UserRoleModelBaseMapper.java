package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.UserRoleModel;
/**
*  @author bran
*/
public interface UserRoleModelBaseMapper {

    int insertUserRoleModel(UserRoleModel object);

    int updateUserRoleModel(UserRoleModel object);

    int update(UserRoleModel.UpdateBuilder object);

    List<UserRoleModel> queryUserRoleModel(UserRoleModel object);

    UserRoleModel queryUserRoleModelLimit1(UserRoleModel object);

}