package org.bran.branproxy.service;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.AddRoleDto;
import org.bran.branproxy.vo.role.RoleVo;

import java.util.List;

/**
 * @author lizhle
 */
public interface IRoleService {

    List<RoleVo> listRole();

    ResultResponse addRole(AddRoleDto dto);



}
