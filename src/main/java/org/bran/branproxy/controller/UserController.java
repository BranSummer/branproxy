package org.bran.branproxy.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.UserLoginDto;
import org.bran.branproxy.service.IUserService;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    /**
     * 登陆
     * @return ResultResponse
     */
    @PostMapping("/login")
    @ResponseBody
    public ResultResponse login(@RequestBody UserLoginDto dto){
       /* Subject user = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(dto.getUsername(),dto.getPwd());
        try {
            user.login(token);
        } catch (AuthenticationException e) {
            return ResultResponse.buildFail("fail in login");
        }*/

        return ResultResponse.buildSuccess();
    }

    @PostMapping("/apiKey")
    @ResponseBody
    public ResultResponse sendApiKey(Long uid){

        return null;
    }

    /**
     * 登出
     */
    @GetMapping("/logout")
    public String logout(){
        Subject user = SecurityUtils.getSubject();
        user.logout();
        return "/login";
    }


}
