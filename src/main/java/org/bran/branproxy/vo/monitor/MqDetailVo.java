package org.bran.branproxy.vo.monitor;

import lombok.Data;

/**
 * @author lizhle
 */
@Data
public class MqDetailVo {

    private String queueName;

    private String containerIdentity;

    private Boolean activeContainer;

    private Boolean running;

    private Integer activeConsumerCount;
}
