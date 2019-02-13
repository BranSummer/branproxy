package org.bran.branproxy.dao;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.model.mysql.PermissionEntity;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-6 18:05
 * @Description:
 */
public class PermissionRepositoryTest extends BranproxyApplicationTests {

    @Resource
    private PermissionRepository permissionRepository;

    @Test
    public void testAddPermission(){
        Date now = new Date();
        PermissionEntity permissionEntity = new PermissionEntity();
        permissionEntity.setPermissionName("test:create");
        permissionEntity.setAddTime(now);
        permissionEntity.setAddUid("test_uid");
        permissionEntity.setUpdateTime(now);
        permissionEntity.setUpdateUid("test_uid");
        permissionRepository.save(permissionEntity);
    }
}