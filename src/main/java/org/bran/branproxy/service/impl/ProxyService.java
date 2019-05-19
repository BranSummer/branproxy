package org.bran.branproxy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.bran.branproxy.common.enums.AnonymityEnum;
import org.bran.branproxy.common.enums.ProtocolEnum;
import org.bran.branproxy.common.vo.PagedResponse;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.dto.ProxyQuery;
import org.bran.branproxy.model.GroupModel;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.service.IProxyService;
import org.bran.branproxy.vo.proxy.GroupVo;
import org.bran.branproxy.vo.proxy.ProxyCountVo;
import org.bran.branproxy.vo.proxy.ProxyVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
@Slf4j
@Service
public class ProxyService implements IProxyService {

    @Resource
    private IpProxyModelMapper ipProxyModelMapper;

    @Override
    public PagedResponse listProxy(ProxyQuery query) {
        int count = ipProxyModelMapper.countByQuery(query);
        if(count == 0) {
            return PagedResponse.buildEmpty();
        }
        List<IpProxyModel> proxyModels = ipProxyModelMapper.selectList(query);
        if(CollectionUtils.isEmpty(proxyModels)){
            return PagedResponse.buildPage(Collections.emptyList(),count);
        }
        List<ProxyVo> voList = proxyModels.stream().map(e->{
            ProxyVo vo = new ProxyVo();
            BeanUtils.copyProperties(e,vo);
            vo.setTypeName(ProtocolEnum.getDescFromValue(e.getType()));
            vo.setAnonymityName(AnonymityEnum.getDescFromValue(e.getAnonymity()));
            return vo;
        }).collect(Collectors.toList());
        return PagedResponse.buildPage(voList,count);
    }

    @Override
    public ProxyCountVo homeCount() {
        ProxyCountVo vo = new ProxyCountVo();
        vo.setTotalCount(ipProxyModelMapper.countTotal());
        ProxyQuery eliteQuery = new ProxyQuery();
        eliteQuery.setAnonymity(AnonymityEnum.ELITE.getValue());
        vo.setEliteCount(ipProxyModelMapper.countByQuery(eliteQuery));
        ProxyQuery transparentQuery = new ProxyQuery();
        transparentQuery.setAnonymity(AnonymityEnum.TRANSPARENT.getValue());
        vo.setTransparentCount(ipProxyModelMapper.countByQuery(transparentQuery));
        ProxyQuery httpsQuery = new ProxyQuery();
        httpsQuery.setType(ProtocolEnum.HTTPS.getValue());
        vo.setHttpsCount(ipProxyModelMapper.countByQuery(httpsQuery));


        return vo;
    }

    @Override
    public List<GroupVo> typeGroupVo() {
        // 代理类型饼图
        List<GroupModel> typeList = ipProxyModelMapper.selectGroupByType();
        return typeList.stream().map(e->{
            GroupVo groupVo = new GroupVo();
            groupVo.setName(ProtocolEnum.getDescFromValue(e.getNameId()));
            groupVo.setValue(e.getValue());
            return groupVo;
        }).collect(Collectors.toList());
    }

    @Override
    public List<GroupVo> anonymityGroupVo() {
        // 代理匿名度饼图
        List<GroupModel> anonymityList = ipProxyModelMapper.selectGroupByAnonymity();
        return anonymityList.stream().map(e->{
            GroupVo groupVo = new GroupVo();
            groupVo.setName(AnonymityEnum.getDescFromValue(e.getNameId()));
            groupVo.setValue(e.getValue());
            return groupVo;
        }).collect(Collectors.toList());
    }
}
