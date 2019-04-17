package org.bran.branproxy.service.impl;

import org.bran.branproxy.service.IAsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author lizhle
 */
@Service
public class AsyncServiceImpl implements IAsyncService {

    @Override
    @Async("asyncProxyCheckExecutor")
    public void executeCheck(AsyncExecutor asyncExecutor) {
        asyncExecutor.execute();
    }
}
