package org.bran.branproxy.service;

import org.bran.branproxy.vo.BasePageVo;

/**
 * @author lizhle
 */
public interface IUserService {

    BasePageVo getUserList();

    void resetApiKey(Long uid);
}
