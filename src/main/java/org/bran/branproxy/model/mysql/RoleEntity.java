package org.bran.branproxy.model.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-5 21:12
 * @Description: 角色实体类
 */
@Data
@Entity(name = "proxy_role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "add_uid")
    private String addUid;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_uid")
    private String updateUid;

    @Column(name = "update_time")
    private Date updateTime;

    @ManyToOne
    private UserEntity user;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "proxy_permission", joinColumns = {@JoinColumn(name = "permission_id")})
    private List<PermissionEntity> permissions;
}
