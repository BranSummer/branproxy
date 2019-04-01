package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.User;
/**
*  @author bran
*/
public interface UserBaseMapper {

    int insertUser(User object);

    int updateUser(User object);

    int update(User.UpdateBuilder object);

    List<User> queryUser(User object);

    User queryUserLimit1(User object);

}