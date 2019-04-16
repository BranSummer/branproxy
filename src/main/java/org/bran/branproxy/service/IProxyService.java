package org.bran.branproxy.service;

import org.bran.branproxy.common.vo.PagedResponse;
import org.bran.branproxy.dto.BasePageQuery;

/**
 * @author lizhle
 */
public interface IProxyService {

    /**
     *
     *
     * @param query
     * @return
     */
    PagedResponse listProxy(BasePageQuery query);
}
