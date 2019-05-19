package org.bran.branproxy.controller;

import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.AddRoleDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author lizhle
 */
@RestController
@Slf4j
@RequestMapping("/user/role")
public class UserRoleController {

    @PostMapping
    public ResultResponse addRole(@RequestBody AddRoleDto dto) {
        return null;
    }

    public ResultResponse removeRole() {
        return null;
    }

    @PostMapping("/edit")
    public ResultResponse updateRole() {
        return null;
    }

    @PostMapping("assignPermission")
    public ResultResponse assignPermission(){return null;}

    @GetMapping("/list")
    public ResultResponse listRole() {
        return null;
    }

    @GetMapping("/{id}")
    public ResultResponse detailRole(@PathVariable("id") long id) {
        return null;
    }
}
