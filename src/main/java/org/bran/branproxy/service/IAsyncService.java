package org.bran.branproxy.service;

/**
 * @author lizhle
 */
public interface IAsyncService {

    void executeInvoke(AsyncExecutor executor);

    @FunctionalInterface
    interface AsyncExecutor {
        void execute();
    }
}
