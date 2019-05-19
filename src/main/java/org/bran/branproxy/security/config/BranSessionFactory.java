package org.bran.branproxy.security.config;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.SessionContext;
import org.apache.shiro.session.mgt.SessionFactory;

/**
 * @author lizhle
 */
public class BranSessionFactory implements SessionFactory {

    @Override
    public Session createSession(SessionContext initData) {
        return new BranSession();
    }
}
