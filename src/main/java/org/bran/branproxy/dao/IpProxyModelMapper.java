package org.bran.branproxy.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.dao.base.IpProxyModelBaseMapper;
/**
*  @author bran
*/
public interface IpProxyModelMapper extends IpProxyModelBaseMapper{

    /**
     * 批量新增
     *
     * @param ipProxyModels
     */
    void insertBatch(List<IpProxyModel> ipProxyModels);
}