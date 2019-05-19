package org.bran.branproxy.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.bran.branproxy.dto.BasePageQuery;
import org.bran.branproxy.dto.ProxyQuery;
import org.bran.branproxy.model.GroupModel;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.dao.base.IpProxyModelBaseMapper;
import org.bran.branproxy.vo.monitor.GeoModel;
import org.bran.branproxy.vo.monitor.GeoVo;
import org.bran.branproxy.vo.proxy.GroupVo;

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

    List<IpProxyModel> selectByMap(Map map);

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

    @Select("SELECT * FROM ip_proxy WHERE latitude != 0")
    List<IpProxyModel> selectListWithoutGeo();

    @Select("SELECT anonymity as nameId, count(*) as value  FROM `ip_proxy` GROUP BY anonymity")
    List<GroupModel> selectGroupByAnonymity();

    @Select("SELECT type as nameId, count(*) as value  FROM `ip_proxy` GROUP BY type")
    List<GroupModel> selectGroupByType();
}