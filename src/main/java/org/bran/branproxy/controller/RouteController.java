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
     *
     * @return
     */
    @GetMapping("/")
    public String localhost() {
        return "login";
    }

    /**
     * 登录页
     *
     * @return
     */
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    /**
     * 首页
     *
     * @return
     */
    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    /**
     * 权限列表页
     *
     * @return
     */
    @GetMapping("/permissionList")
    public String permissionListPage() {
        return "permissionList";
    }

    /**
     * 角色列表页
     *
     * @return
     */
    @GetMapping("/roleList")
    public String roleListPage() {
        return "roleList";
    }

    /**
     * 用户列表页
     *
     * @return
     */
    @GetMapping("/userList")
    public String userListPage() {
        return "userList";
    }

    /**
     * 监控页
     *
     * @return
     */
    @GetMapping("/monitor")
    public String monitorPage() {
        return "monitor";
    }
}
