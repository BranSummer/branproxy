package org.bran.branproxy.vo.role;

import lombok.Data;
import org.bran.branproxy.vo.permission.PermissionVo;

import java.util.List;

/**
 * @author lizhle
 */
@Data
public class RoleVo {

    private Long id;

    private String title;

    private String desc;

    private List<PermissionVo> permissionVos;
}
