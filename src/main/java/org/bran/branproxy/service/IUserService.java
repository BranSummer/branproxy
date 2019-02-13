package org.bran.branproxy.service;

import org.bran.branproxy.model.mysql.UserEntity;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-5 22:04
 * @Description:
 */
public interface IUserService {

    UserEntity selectUserByName(String name);
}
