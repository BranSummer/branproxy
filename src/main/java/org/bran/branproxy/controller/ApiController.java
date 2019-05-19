package org.bran.branproxy.controller;

import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.service.IProxyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: BranSummer
 * @Date: 2018-10-7 21:48
 * @Description:
 */
@RestController
@RequestMapping("api/proxy")
public class ApiController {

    @Resource
    private IProxyService proxyService;

    @GetMapping
    public ResultResponse getProxy(){
        return null;
    }
}
