package org.bran.branproxy.controller;

import org.bran.branproxy.service.IPermissionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Controller
public class RouteController {

    @Resource
    private IPermissionService permissionService;

    /**
     * 默认页(首页)
     */
    @GetMapping("/")
    public String localhost() {
        return "login";
    }

    /**
     * 登录页
     */
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    /**
     * 首页
     */
    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    /**
     * 主页
     */
    @GetMapping("/main")
    public String mainPage() {
        return "main";
    }

    /**
     * 权限列表页
     */
    @GetMapping("/permissionList")
    public String permissionListPage() {
        return "permissionList";
    }

    /**
     * 角色列表页
     */
    @GetMapping("/roleList")
    public String roleListPage() {
        return "roleList";
    }

    /**
     * 用户列表页
     */
    @GetMapping("/userList")
    public String userListPage() {
        return "userList";
    }

    /**
     * 监控页
     */
    @GetMapping("/monitor")
    public String monitorPage() {
        return "monitor";
    }

    /**
     * 定时任务
     */
    @GetMapping("/schedule/index")
    public String schedulePage() {
        return "/schedule/index";
    }

    @GetMapping("/proxy/elite")
    public String elitePage(){
        return "/proxyList/elite";
    }

    @GetMapping("/proxy/transparent")
    public String transparentPage(){
        return "/proxyList/transparent";
    }

    @GetMapping("/proxy/socks")
    public String socksPage(){
        return "/proxyList/socks";
    }
}
