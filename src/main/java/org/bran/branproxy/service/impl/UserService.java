package org.bran.branproxy.service.impl;

import org.bran.branproxy.dao.UserModelMapper;
import org.bran.branproxy.model.UserModel;
import org.bran.branproxy.service.IUserService;
import org.bran.branproxy.vo.BasePageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Service
public class UserService implements IUserService {

    @Resource
    private UserModelMapper userModelMapper;

    @Override
    public BasePageVo getUserList() {

        userModelMapper.queryUserModel(UserModel.QueryBuild().isDelete(0).build());
        return null;
    }
}
