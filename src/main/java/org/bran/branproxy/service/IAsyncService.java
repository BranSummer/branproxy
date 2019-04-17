package org.bran.branproxy.service;

/**
 * @author lizhle
 */
public interface IAsyncService {

    void executeCheck(AsyncExecutor executor);

    @FunctionalInterface
    interface AsyncExecutor {
        void execute();
    }
}
