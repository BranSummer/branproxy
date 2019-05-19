package org.bran.branproxy.service;

import org.bran.branproxy.common.vo.PagedResponse;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.dto.ProxyQuery;
import org.bran.branproxy.vo.proxy.GroupVo;
import org.bran.branproxy.vo.proxy.ProxyCountVo;

import java.util.List;

/**
 * @author lizhle
 */
public interface IProxyService {

    /**
     *
     * @param query
     * @return
     */
    PagedResponse listProxy(ProxyQuery query);

    ProxyCountVo homeCount();

    List<GroupVo> typeGroupVo();

    List<GroupVo> anonymityGroupVo();

}
