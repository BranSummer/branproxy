package org.bran.branproxy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.dto.ProxyQuery;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.dao.base.IpProxyModelBaseMapper;
import org.bran.branproxy.vo.monitor.GeoModel;

/**
*  @author bran
*/
@Mapper
public interface IpProxyModelMapper extends IpProxyModelBaseMapper{

    /**
     * 批量新增
     *
     * @param ipProxyModels
     */
    void insertBatch(List<IpProxyModel> ipProxyModels);

    /***
     *
      * @return 总数
     */
    @Select("SELECT COUNT(*) from ip_proxy")
    int countTotal();

    /**
     *
     * @return
     */
    @Select("select * from ip_proxy  ORDER BY id DESC")
    List<IpProxyModel> selectAll();


    List<IpProxyModel> selectList(BasePageQuery query);

    /**
     * 查询符合条件的个数
     *
     * @param query
     * @return
     */
    int countByQuery(ProxyQuery query);

    @Select("SELECT latitude , longitude FROM ip_proxy WHERE latitude != 0")
    List<GeoModel> queryGeoList();
}