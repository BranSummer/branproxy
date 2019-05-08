package org.bran.branproxy.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.common.RedisConstants;
import org.bran.branproxy.dao.CityBlockIpv4Mapper;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.model.CityBlockIpv4;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.vo.monitor.GeoModel;
import org.bran.branproxy.vo.monitor.GeoVo;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
@Component
public class LocationUtil {

    private static final String NETWORK_FORMAT = "%s.%s.%s.%s";

    private static final String IP_ZERO = "0";

    @Resource
    private CityBlockIpv4Mapper cityBlockIpv4Mapper;
    @Resource
    private IpProxyModelMapper ipProxyModelMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public List<GeoVo> getLocaltionVo(){
        String geoStr = stringRedisTemplate.opsForValue().get(RedisConstants.REDIS_GEO_LIST);
        if(StringUtils.isNotBlank(geoStr)){
            return JSONObject.parseArray(geoStr,GeoVo.class);
        }
        List<GeoModel> models = ipProxyModelMapper.queryGeoList();
        Map<String,Integer> map = new HashMap((int)(models.size()/0.75));
        models.forEach(e->{
            String modelStr = JsonUtil.toJson(e);
            if(map.containsKey(modelStr)){
                map.put(modelStr,map.get(modelStr)+1);
            }else {
                map.put(modelStr,1);
            }
        });
        List<GeoVo> geoVos = map.keySet().stream().map(e->{
            GeoModel model = JsonUtil.praseJson(e,GeoModel.class);
            GeoVo vo = new GeoVo();
            vo.setLatitude(model.getLatitude());
            vo.setLongitude(model.getLongitude());
            vo.setCount(map.get(e));
            return vo;
        }).collect(Collectors.toList());
        stringRedisTemplate.opsForValue().set(RedisConstants.REDIS_GEO_LIST,JsonUtil.toJson(geoVos));
        return geoVos;
    }

    public IpProxyModel getIpLocation(IpProxyModel ipProxyModel){
        String network = getNetworkFormHost(ipProxyModel.getIp());
        if(StringUtils.isBlank(network)){
            return ipProxyModel;
        }
        CityBlockIpv4 addr = cityBlockIpv4Mapper.queryCityBlockIpv4Limit1(CityBlockIpv4.QueryBuild()
                .rightFuzzyNetwork(network).build());
        if(Objects.isNull(addr)){
            return ipProxyModel;
        }
        ipProxyModel.setLatitude(addr.getLatitude());
        ipProxyModel.setLongitude(addr.getLongitude());
        return ipProxyModel;
    }

    public void setIpLocation(IpProxyModel ipProxyModel) {
        String network = getNetworkFormHost(ipProxyModel.getIp());
        if(StringUtils.isBlank(network)){
            return;
        }
        CityBlockIpv4 addr = cityBlockIpv4Mapper.queryCityBlockIpv4Limit1(CityBlockIpv4.QueryBuild()
                .rightFuzzyNetwork(network).build());
        if(Objects.isNull(addr)){
            return;
        }
        ipProxyModelMapper.update(IpProxyModel.UpdateBuild()
                .set(IpProxyModel.Build().latitude(addr.getLatitude()).longitude(addr.getLongitude()).build())
                .where(IpProxyModel.ConditionBuild().idList(ipProxyModel.getId()))
                .build());
    }

    public String getNetworkFormHost(String host) {
        if (StringUtils.isBlank(host)) {
            return StringUtils.EMPTY;
        }
        String[] ipParts = host.split("\\.");
        int firstPart = Integer.parseInt(ipParts[0]);
        // A 类地址
        if (firstPart >= 0 && firstPart < 128) {
            return String.format(NETWORK_FORMAT, ipParts[0], IP_ZERO, IP_ZERO, IP_ZERO);
            // B类地址
        } else if (firstPart >= 128 && firstPart < 192) {
            return String.format(NETWORK_FORMAT,ipParts[0],ipParts[1],IP_ZERO,IP_ZERO);
        }else if(firstPart >= 192 && firstPart <224){
            return String.format(NETWORK_FORMAT,ipParts[0],ipParts[1],ipParts[2],IP_ZERO);
        }
        return StringUtils.EMPTY;
    }

    public static void main(String[] args) {
        String a = "203.177.135.133";
        String[] ipParts = a.split("\\.");
        for (String ipPart : ipParts) {
            System.out.println(ipPart);
        }
    }
}
