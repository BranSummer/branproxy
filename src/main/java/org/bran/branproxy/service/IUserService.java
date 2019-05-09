package org.bran.branproxy.service;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.user.AddUserDto;
import org.bran.branproxy.model.UserModel;
import org.bran.branproxy.vo.BasePageVo;
import org.bran.branproxy.vo.user.UserVo;

import java.util.List;

/**
 * @author lizhle
 */
public interface IUserService {

    List<UserVo> getUserList();

    ResultResponse saveUser(AddUserDto dto);

    void resetApiKey(Long uid);

    UserModel getUserByUid(long uid);
}
