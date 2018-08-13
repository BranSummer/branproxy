package org.bran.branproxy.util;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.model.ProxyModel;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class DetectorTest extends BranproxyApplicationTests {

    @Autowired
    private Detector detector;

    @Test
    public void isAvailable() {
        ProxyModel proxyModel =new ProxyModel();
        proxyModel.setIp("218.3.131.244");
        proxyModel.setPort(	808);
        Assert.assertTrue(detector.isAvailable(proxyModel));
    }
}