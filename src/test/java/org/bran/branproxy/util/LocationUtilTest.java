package org.bran.branproxy.util;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class LocationUtilTest extends BranproxyApplicationTests {

    @Resource
    private LocationUtil locationUtil;
    @Resource
    private IpProxyModelMapper ipProxyModelMapper;

    @Test
    public void setIpLocation() {
        List<IpProxyModel> ipProxyModels = ipProxyModelMapper.selectAll();
        ipProxyModels.forEach(e -> locationUtil.setIpLocation(e));
    }

}