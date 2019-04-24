package org.bran.branproxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lizhle
 */
@Controller
@RequestMapping("/onstage")
public class OnstageRouteController {

    @GetMapping("/login")
    public String onstageLogin() {
        return "onstage/login";
    }

    @GetMapping("/register")
    public String onstageReg(){
        return "onstage/login";
    }

    public String onstageSet() {
        return "onstage/set";
    }

    public String onstageReset(){
        return "";
    }
}
