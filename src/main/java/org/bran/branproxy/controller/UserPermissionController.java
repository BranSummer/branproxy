package org.bran.branproxy.controller;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.permission.AddPermissionDto;
import org.bran.branproxy.service.IPermissionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@RestController
@RequestMapping("/user/permission")
public class UserPermissionController {

    @Resource
    private IPermissionService permissionService;

    @PostMapping
    public ResultResponse addPermission(@RequestBody AddPermissionDto dto){
        return permissionService.addPermission(dto);
    }

    public ResultResponse removePermission(){
        return null;
    }

    public ResultResponse updatePermission(){
        return null;
    }

    public ResultResponse listPermission(){
        return null;
    }

    public ResultResponse detailPermission(){
        return null;
    }
}
