package org.bran.branproxy.security.config;

import org.apache.shiro.session.mgt.SimpleSession;

import java.io.Serializable;

import static org.bran.branproxy.security.config.ShiroConfig.SESSION_TIMEOUT_IN_SECONDS;

/**
 * @author lizhle
 */
public class BranSession extends SimpleSession implements Serializable {

    /**
     * 会话username属性
     */
    public static final String ATTRIBUTE_USERNAME = "username";

    public BranSession() {
        super();
        this.setTimeout(SESSION_TIMEOUT_IN_SECONDS * 1000L);
    }
}
