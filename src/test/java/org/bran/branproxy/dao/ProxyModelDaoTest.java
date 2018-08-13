package org.bran.branproxy.dao;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.model.ProxyModel;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ProxyModelDaoTest extends BranproxyApplicationTests {

    @Autowired
    ProxyModelDao proxyModelDao;

    @Test
    public void save() {
        ProxyModel proxyModel =new ProxyModel();
        proxyModel.setIp("125.62.26.197");
        proxyModel.setPort(3128);
        System.out.println(proxyModel.toJson());
        proxyModelDao.save(proxyModel);
    }

//    @Test
    public void save1() {
    }

//    @Test
    public void delete() {
    }

//    @Test
    public void update() {
    }

//    @Test
    public void pop() {
        ProxyModel proxyModel = proxyModelDao.pop();
        System.out.println(proxyModel);
    }
}