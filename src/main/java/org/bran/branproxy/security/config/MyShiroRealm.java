package org.bran.branproxy.security.config;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-6 14:53
 * @Description: TODO
 */
@Component
public class MyShiroRealm extends AuthorizingRealm {

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 获取登录用户名
        String username = (String) principalCollection.getPrimaryPrincipal();
        // 从数据库查询用户

        // 存储角色和权限信息的POJO
        SimpleAuthorizationInfo authInfo = new SimpleAuthorizationInfo();
        // 添加用户角色和权限

        return authInfo;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        if(authenticationToken.getPrincipal()==null){
            return null;
        }
        // 获取用户信息
        String username = authenticationToken.getPrincipal().toString();


        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
                authenticationToken.getPrincipal().toString(),
                authenticationToken.getCredentials().toString(),
                getName());
        return authenticationInfo;
    }
}
