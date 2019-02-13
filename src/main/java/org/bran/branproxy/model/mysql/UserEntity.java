package org.bran.branproxy.model.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-5 21:10
 * @Description: 用户实体类
 */
@Data
@Entity(name = "proxy_user")
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "add_uid")
    private String addUid;

    @Column(name = "add_time")
    private Date addTime;

    @Column(name = "update_uid")
    private String updateUid;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 一个user可以有多个role
     */
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user_entity")
    private List<RoleEntity> roles;
}
