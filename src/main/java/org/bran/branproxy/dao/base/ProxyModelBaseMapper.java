package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.ProxyModel;
/**
*  @author bran
*/
public interface ProxyModelBaseMapper {

    int insertProxyModel(ProxyModel object);

    int updateProxyModel(ProxyModel object);

    int update(ProxyModel.UpdateBuilder object);

    List<ProxyModel> queryProxyModel(ProxyModel object);

    ProxyModel queryProxyModelLimit1(ProxyModel object);

}