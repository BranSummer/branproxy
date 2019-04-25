package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.CityBlockIpv4;
/**
*  @author bran
*/
public interface CityBlockIpv4BaseMapper {

    int insertCityBlockIpv4(CityBlockIpv4 object);

    int updateCityBlockIpv4(CityBlockIpv4 object);

    int update(CityBlockIpv4.UpdateBuilder object);

    List<CityBlockIpv4> queryCityBlockIpv4(CityBlockIpv4 object);

    CityBlockIpv4 queryCityBlockIpv4Limit1(CityBlockIpv4 object);

}