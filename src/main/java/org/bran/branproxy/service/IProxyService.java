package org.bran.branproxy.service;

import org.bran.branproxy.common.vo.PagedResponse;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.dto.ProxyQuery;
import org.bran.branproxy.vo.proxy.ProxyCountVo;

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
}
