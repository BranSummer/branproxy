package org.bran.branproxy.controller;

import org.bran.branproxy.service.IPermissionService;
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

    @GetMapping("/")
    public String localhost(){
        return "login";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/permissionList")
    public String permissionListPage(ModelMap modelMap) {
        modelMap.addAttribute("list",permissionService.listPermission());
        return "permissionList";
    }
}
