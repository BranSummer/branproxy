package org.bran.branproxy.controller;

import org.bran.branproxy.common.vo.PagedResponse;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.service.IProxyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@RestController
@RequestMapping("/proxy")
public class ProxyController {

    @Resource
    private IProxyService proxyService;

    @GetMapping("/list")
    public PagedResponse listProxy(BasePageQuery query){
        return proxyService.listProxy(query);
    }
}
