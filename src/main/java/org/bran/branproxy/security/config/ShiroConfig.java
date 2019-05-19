package org.bran.branproxy.security.config;

import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.bran.branproxy.security.cache.ShiroCacheManager;
import org.bran.branproxy.security.cache.ShiroSessionDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: BranSummer
 * @Date: 2019-2-6 15:44
 * @Description:
 */
//@Configuration
public class ShiroConfig {

    /**
     * session超时时间
     */
    public static final int SESSION_TIMEOUT_IN_SECONDS = 3600;

    /**
     * redis key prefix
     */
    public static final String REDIS_SESSION_KEY = "shiro:session:";
    public static final String SHIRO_CACHE_KEY ="shiri:cache:";


    @Bean
    public CacheManager shiroCacheManager(){
        return new ShiroCacheManager();
    }

    @Bean
    public BranSessionFactory branSessionFactory(){return new BranSessionFactory();}

    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public ShiroSessionDao sessionDao() {
        return new ShiroSessionDao();
    }

    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public MyShiroRealm myShiroRealm(){
        MyShiroRealm shiroRealm = new MyShiroRealm();
        shiroRealm.setCacheManager(shiroCacheManager());
        return shiroRealm;
    }

    /**
     * 会话管理器(使用redis存储session)
     *
     * @return 会话管理器
     */
    @Bean
    public SessionManager sessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setCacheManager(shiroCacheManager());
        sessionManager.setSessionDAO(sessionDao());
        sessionManager.setGlobalSessionTimeout(SESSION_TIMEOUT_IN_SECONDS * 1000L);
        sessionManager.setSessionFactory(branSessionFactory());
        return sessionManager;
    }

    /**
     * 配置realm的管理认证
     * @param myShiroRealm
     * @return
     */
    @Bean
    public SecurityManager securityManager(MyShiroRealm myShiroRealm){
        DefaultSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(myShiroRealm);
        return securityManager;
    }

    /**
     * Filter工厂，设置对应的过滤条件和跳转条件
     * @param securityManager
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        Map<String,String> filterChainDefinitionMap = new HashMap<>();
        //登出
        filterChainDefinitionMap.put("/user/logout","logout");
        //对所有用户认证
        filterChainDefinitionMap.put("/**","anon");
        //匿名访问静态资源
        filterChainDefinitionMap.put("/static/**", "anon");
        filterChainDefinitionMap.put("/static/lib/**", "anon");
        //登录
        shiroFilterFactoryBean.setLoginUrl("/user/login");
        //首页
        shiroFilterFactoryBean.setSuccessUrl("/index");
        //错误页面，认证不通过跳转
        shiroFilterFactoryBean.setUnauthorizedUrl("/error");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
        return shiroFilterFactoryBean;
    }

    /**
     * shiro生命周期处理器
     * 为所有实现了Initializable 或 Destroyable接口的shiro对象(如AuthorizingRealm)自动调用init和destroy方法
     */
    @Bean(name = "lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /**
     * shiro aop权限advisor, 扫描(RequiresPermissions, RequiresRoles等注解)
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
