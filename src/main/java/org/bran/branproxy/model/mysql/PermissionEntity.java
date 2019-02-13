package org.bran.branproxy.model.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-5 21:13
 * @Description: 权限实体类
 */
@Data
@Entity(name = "proxy_permission")
public class PermissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "permission_name")
    private String permissionName;

    @Column(name = "add_uid")
    private String addUid;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_uid")
    private String updateUid;

    @Column(name = "update_time")
    private Date updateTime;

    @ManyToOne
    private RoleEntity role;
}
