package org.bran.branproxy.util;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class DetectUtilTest extends BranproxyApplicationTests {

    @Resource
    private DetectUtil detectUtil;
    @Resource
    private ProxyModelMapper proxyModelMapper;

    @Test
    public void detect() {
    }
}