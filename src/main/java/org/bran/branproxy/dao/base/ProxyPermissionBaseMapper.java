package org.bran.branproxy.dao.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.bran.branproxy.model.ProxyPermission;
/**
*  @author bransummer
*/
public interface ProxyPermissionBaseMapper {

    int insertProxyPermission(ProxyPermission object);

    int updateProxyPermission(ProxyPermission object);

    int update(ProxyPermission.UpdateBuilder object);

    List<ProxyPermission> queryProxyPermission(ProxyPermission object);

    ProxyPermission queryProxyPermissionLimit1(ProxyPermission object);

}