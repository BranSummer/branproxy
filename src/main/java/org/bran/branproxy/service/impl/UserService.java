package org.bran.branproxy.service.impl;

import org.bran.branproxy.dao.ProxyPermissionMapper;
import org.bran.branproxy.model.ProxyPermission;
import org.bran.branproxy.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @Auther: BranSummer
 * @Date: 2019-2-6 16:08
 * @Description:
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Resource
    private ProxyPermissionMapper proxyPermissionMapper;

    @Override
    public void insertPermission(ProxyPermission proxyPermission) {
        proxyPermissionMapper.queryProxyPermission(ProxyPermission.QueryBuild().build());
    }
}
