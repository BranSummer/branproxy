package org.bran.branproxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lizhle
 */
@Controller
public class RouteController {

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
}
