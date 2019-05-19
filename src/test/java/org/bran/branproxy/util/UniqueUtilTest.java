package org.bran.branproxy.util;

import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.model.ProxyBaseModel;
import org.bran.branproxy.model.ProxyModel;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class UniqueUtilTest extends BranproxyApplicationTests {

    @Resource
    private UniqueUtil uniqueUtil;
    @Resource
    private ProxyModelMapper proxyModelMapper;

    @Test
    public void isDuplicate() {
       /* int totalCount = proxyModelMapper.countAll();
        int pageCount = PageUtil.getPageCount(totalCount,200);
        for (int i = 1; i <=pageCount; i++) {
            BasePageQuery query = new BasePageQuery();
            query.setLimit(200);
            query.setPage(i);
            List<ProxyModel> proxyModels = proxyModelMapper.selectList(query);
            System.out.println(proxyModels.get(0));
            List<ProxyBaseModel> baseModels = proxyModels.stream().map(e->{
                ProxyBaseModel baseModel = new ProxyBaseModel();
                baseModel.setIp(e.getIp());
                baseModel.setPort(e.getPort());
                return baseModel;
            }).collect(Collectors.toList());
            long eachValue =  uniqueUtil.addAll(baseModels);
            log.info("once add， value = {}",eachValue);
        }
        long actualCount = uniqueUtil.getUniqueSize();
        log.info("total distinct count = {}",actualCount);*/
    }

    @Test
    public void removeDuplicate(){
        /*List<ProxyModel> proxyModels = proxyModelMapper.queryProxyModel(ProxyModel.Build().build());
        proxyModels.forEach(e->{
            ProxyBaseModel baseModel = new ProxyBaseModel();
            baseModel.setIp(e.getIp());
            baseModel.setPort(e.getPort());
            if(uniqueUtil.isDuplicateWithSet(baseModel)){
                proxyModelMapper.update(ProxyModel.UpdateBuild()
                        .set(ProxyModel.Build().timeout(-3).build())
                        .where(ProxyModel.ConditionBuild().idList(e.getId())));
                System.out.println(baseModel);
            }
        });*/
    }
}