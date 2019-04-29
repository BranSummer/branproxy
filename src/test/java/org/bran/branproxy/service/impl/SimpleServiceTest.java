package org.bran.branproxy.service.impl;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.job.crawler.Fate0Source;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.model.ProxyModel;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class SimpleServiceTest extends BranproxyApplicationTests {

    @Resource
    private IpProxyModelMapper ipProxyModelMapper;
    @Resource
    private ProxyModelMapper proxyModelMapper;
    @Resource
    private Fate0Source fate0Source;


    @Test
    public void testMigrate(){
        migrate();
    }

    @Test
    public void testFate0(){
       fate0Source.getFromFateZero();
    }

    private void migrate(){
        List<ProxyModel> oldProxyModel = proxyModelMapper.queryProxyModel(ProxyModel.Build().build());
        List<IpProxyModel> ipProxyModels = oldProxyModel.stream().map(e->{
            IpProxyModel ipProxyModel = new IpProxyModel();
            BeanUtils.copyProperties(e,ipProxyModel);
            return ipProxyModel;
        }).collect(Collectors.toList());
        AtomicInteger count = new AtomicInteger();
        ipProxyModels.forEach(e->{
            ipProxyModelMapper.insertIpProxyModel(e);
            count.getAndIncrement();
            System.out.println(count.intValue());
        });
    }
}