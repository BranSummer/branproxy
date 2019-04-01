package org.bran.branproxy.service;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.permission.AddPermissionDto;
import org.bran.branproxy.vo.BasePageVo;

/**
 * @author lizhle
 */
public interface IPermissionService {

    ResultResponse addPermission(AddPermissionDto dto);

    ResultResponse removePermission(long id);

    ResultResponse updatePermission();

    BasePageVo listPermission();
}
