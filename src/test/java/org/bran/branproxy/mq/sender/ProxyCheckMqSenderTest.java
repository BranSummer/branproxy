package org.bran.branproxy.mq.sender;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.model.ProxyModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class ProxyCheckMqSenderTest extends BranproxyApplicationTests {

    @Resource
    private ProxyCheckMqSender proxyCheckMqSender;
    @Resource
    private ProxyModelMapper proxyModelMapper;

    @Test
    public void pubMessage() {
        List<ProxyModel> proxyModelList = proxyModelMapper.queryProxyModel(ProxyModel.QueryBuild().timeout(0).build());
        proxyModelList.forEach(e-> proxyCheckMqSender.pubMessage(e));
    }
}