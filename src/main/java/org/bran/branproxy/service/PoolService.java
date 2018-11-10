package org.bran.branproxy.service;

import org.bran.branproxy.model.ProxyModel;

/**
 * @Auther: BranSummer
 * @Date: 2018-10-12 10:24
 * @Description:
 */
public interface PoolService {

    void saveProxy(ProxyModel proxyModel);

    Integer countProxy();

    ProxyModel getProxy();

}
