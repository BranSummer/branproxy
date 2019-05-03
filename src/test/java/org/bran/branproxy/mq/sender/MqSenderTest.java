package org.bran.branproxy.mq.sender;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.model.ProxyModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

public class MqSenderTest extends BranproxyApplicationTests {

    @Resource
    private MqSender mqSender;
    @Resource
    private ProxyModelMapper proxyModelMapper;

    @Test
    public void pubMessage() {

    }
}