package org.bran.branproxy.job.monitor;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author lizhle
 */
@Component
public class ThreadPoolMonitor {

    @Resource
    private SimpMessagingTemplate simpMessagingTemplate;
    @Resource
    private ThreadPoolTaskExecutor asyncProxyCheckExecutor;

    public void pubThreadPoolMessage(){
        ThreadPoolExecutor executor = asyncProxyCheckExecutor.getThreadPoolExecutor();
        // 当前排队任务数
        int taskCount = executor.getQueue().size();
        System.out.println("当前排队任务数"+taskCount);
        // 当前活动线程数
        int activeCount = executor.getActiveCount();
        System.out.println("当前活动线程数"+activeCount);
        // 任务数
        long count = executor.getTaskCount();
        System.out.println("任务数"+count);
    }
}
