package org.bran.branproxy.job.monitor;

import org.springframework.stereotype.Component;

/**
 * @author lizhle
 */
@Component("helloTask")
public class TestScheduleTask {

    public void sayHello(){
        System.out.println("hello");
    }
}
