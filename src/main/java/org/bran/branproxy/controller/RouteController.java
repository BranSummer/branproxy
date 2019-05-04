package org.bran.branproxy.controller;

import org.bran.branproxy.service.IPermissionService;
import org.bran.branproxy.service.IProxyService;
import org.bran.branproxy.service.impl.ProxyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Controller
public class RouteController {

    @Resource
    private IPermissionService permissionService;
    @Resource
    private IProxyService proxyService;
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
    public String mainPage(ModelMap model) {
        model.addAttribute("countVo",proxyService.homeCount());
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
    @GetMapping("/schedule/crawler")
    public String scheduleCrawlerPage() {
        return "/schedule/crawler";
    }

    @GetMapping("/schedule/frequency")
    public String scheduleFrequencyPage(){
        return "/schedule/frequency";
    }

    @GetMapping("schedule/healthyCheck")
    public String scheduleHealthyCheckPage(){
        return "schedule/healthyCheck";
    }

    @GetMapping("/proxy/elite")
    public String elitePage(){
        return "/proxyList/elite";
    }

    @GetMapping("/proxy/transparent")
    public String transparentPage(){
        return "/proxyList/transparent";
    }

    @GetMapping("/proxy/https")
    public String socksPage(){
        return "/proxyList/https";
    }
}
