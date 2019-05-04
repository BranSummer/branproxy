package org.bran.branproxy.util;

import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.dao.CityBlockIpv4Mapper;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Component
public class LocationUtil {

    @Resource
    private CityBlockIpv4Mapper cityBlockIpv4Mapper;
    @Resource
    private IpProxyModelMapper ipProxyModelMapper;

    public IpProxyModel setIpLocation(IpProxyModel ipProxyModel){


        return null;
    }

    private String getNetworkFormHost(String host){
        if(StringUtils.isBlank(host)){
            return StringUtils.EMPTY;
        }
        return null;
    }
}
