package org.bran.branproxy.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.dao.base.ProxyModelBaseMapper;
/**
*  @author bran
*/
public interface ProxyModelMapper extends ProxyModelBaseMapper{

    /**
     *
     * @param list
     */
    void insertBatch(List<ProxyModel> list);
}