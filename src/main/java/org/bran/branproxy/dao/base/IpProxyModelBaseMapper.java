package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.IpProxyModel;
/**
*  @author bran
*/
public interface IpProxyModelBaseMapper {

    int insertIpProxyModel(IpProxyModel object);

    int updateIpProxyModel(IpProxyModel object);

    int update(IpProxyModel.UpdateBuilder object);

    List<IpProxyModel> queryIpProxyModel(IpProxyModel object);

    IpProxyModel queryIpProxyModelLimit1(IpProxyModel object);

}