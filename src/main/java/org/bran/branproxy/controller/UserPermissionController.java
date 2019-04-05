package org.bran.branproxy.controller;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.permission.AddPermissionDto;
import org.bran.branproxy.service.IPermissionService;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}")
    public ResultResponse removePermission(@PathVariable("id") long id){
        return permissionService.removePermission(id);
    }

    public ResultResponse updatePermission(){
        return null;
    }

    @GetMapping("/list")
    public ResultResponse listPermission(){
        return ResultResponse.buildSuccess(permissionService.listPermission());
    }

    public ResultResponse detailPermission(){
        return null;
    }
}
