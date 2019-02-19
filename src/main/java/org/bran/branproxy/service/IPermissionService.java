package org.bran.branproxy.service;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.model.ProxyPermission;


/**
 * @Auther: BranSummer
 * @Date: 2019-2-17 16:55
 * @Description:
 */
public interface IPermissionService {

    ResultResponse insertPermission(ProxyPermission proxyPermission);

    ResultResponse updatePermission(ProxyPermission proxyPermission);
}
