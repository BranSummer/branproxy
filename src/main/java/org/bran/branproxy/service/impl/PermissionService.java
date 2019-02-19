package org.bran.branproxy.service.impl;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dao.ProxyPermissionMapper;
import org.bran.branproxy.model.ProxyPermission;
import org.bran.branproxy.service.IPermissionService;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-17 16:58
 * @Description:
 */
public class PermissionService implements IPermissionService {

    @Resource
    private ProxyPermissionMapper proxyPermissionMapper;

    @Override
    public ResultResponse insertPermission(ProxyPermission proxyPermission) {
        ProxyPermission permissionsFromDB = proxyPermissionMapper.queryProxyPermissionLimit1(ProxyPermission.QueryBuild()
                .permissionName(proxyPermission.getPermissionName())
                .build());
        if(Objects.nonNull(permissionsFromDB)){
            return ResultResponse.buildFail("权限名已存在");
        }
        proxyPermissionMapper.insertProxyPermission(proxyPermission);
        return ResultResponse.buildSuccess();
    }

    @Override
    public ResultResponse updatePermission(ProxyPermission proxyPermission) {
        ProxyPermission permissionsFromDB = proxyPermissionMapper.queryProxyPermissionLimit1(ProxyPermission.QueryBuild()
                .permissionName(proxyPermission.getPermissionName())
                .build());
        if(proxyPermission.getPermissionName().equals(permissionsFromDB.getPermissionName())){
            return ResultResponse.buildFail("权限名已存在");
        }
        proxyPermissionMapper.updateProxyPermission(proxyPermission);
        return ResultResponse.buildSuccess();
    }
}
