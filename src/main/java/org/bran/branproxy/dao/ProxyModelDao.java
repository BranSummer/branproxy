package org.bran.branproxy.dao;

import org.bran.branproxy.model.ProxyModel;

import java.util.List;

public interface ProxyModelDao {

    void save(ProxyModel proxyModel);

    void save(Iterable<ProxyModel> proxyModels);

    void delete(ProxyModel proxyModel);

    void update(ProxyModel proxyModel,int timeout);

    ProxyModel pop();
}
