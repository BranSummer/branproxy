package org.bran.branproxy.service;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.vo.BasePageVo;

/**
 * @author lizhle
 */
public interface IPermissionService {

    ResultResponse addPermission();

    ResultResponse removePermission();

    ResultResponse updatePermission();

    BasePageVo listPermission();
}
