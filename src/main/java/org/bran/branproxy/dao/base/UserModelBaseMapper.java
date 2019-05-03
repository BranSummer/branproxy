package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.UserModel;
/**
*  @author bran
*/
public interface UserModelBaseMapper {

    int insertUserModel(UserModel object);

    int updateUserModel(UserModel object);

    int update(UserModel.UpdateBuilder object);

    List<UserModel> queryUserModel(UserModel object);

    UserModel queryUserModelLimit1(UserModel object);

}