package org.bran.branproxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.dao.base.ProxyModelBaseMapper;

/**
 * @author bran
 */
public interface ProxyModelMapper extends ProxyModelBaseMapper {

    /**
     * 批量插入
     *
     * @param list List<ProxyModel>
     */
    void insertBatch(List<ProxyModel> list);

    /**
     * 列表查询
     *
     * @param query BasePageQuery
     * @return List<ProxyModel>
     */
    List<ProxyModel> selectList(BasePageQuery query);

    /**
     *  查询总数
     *
     * @return 总数
     */
    int countAll();

    /**
     *
     * @return
     */
    List<Long> selectProxyIdsAll();
}