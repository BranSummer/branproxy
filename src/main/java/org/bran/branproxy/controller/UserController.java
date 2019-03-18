package org.bran.branproxy.controller;

import org.apache.shiro.SecurityUtils;
import org.bran.branproxy.common.vo.ResultResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhle
 */
@RestController
public class UserController {

    /**
     * 登陆
     * @return ResultResponse
     */
    @PostMapping("/login")
    public ResultResponse login(){

        return null;
    }

    /**
     * 登出
     * @return ResultResponse
     */
    @PostMapping("/logout")
    public ResultResponse logout(){
        return null;
    }
}
