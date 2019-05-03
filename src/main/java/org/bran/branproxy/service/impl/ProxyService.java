package org.bran.branproxy.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.bran.branproxy.common.enums.AnonymityEnum;
import org.bran.branproxy.common.enums.ProtocolEnum;
import org.bran.branproxy.common.vo.PagedResponse;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.service.IProxyService;
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
    private ProxyModelMapper proxyModelMapper;
    @Resource
    private IpProxyModelMapper ipProxyModelMapper;

    @Override
    public PagedResponse listProxy(BasePageQuery query) {
        int count = ipProxyModelMapper.countTotal();
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
}
