package org.bran.branproxy.controller;

import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.model.ResultDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: BranSummer
 * @Date: 2018-10-7 21:48
 * @Description:
 */
@RestController
@RequestMapping("/branproxy")
public class ProxyController {


    /**
     * @Description: 插入一个代理
     * @param proxyModel
     * @return
     */
    @PostMapping("/proxy")
    public ResultDTO saveProxy(ProxyModel proxyModel){
        return null;
    }

    /**
     * @Description: 获取一个代理
     * @return
     */
    @GetMapping("/proxy/random")
    public ResultDTO getProxy(){
        return null;
    }

    /**
     * @Description: 获取代理池数量
     * @return
     */
    @GetMapping("/proxy/number")
    public ResultDTO countProxy(){
        return null;
    }
}
