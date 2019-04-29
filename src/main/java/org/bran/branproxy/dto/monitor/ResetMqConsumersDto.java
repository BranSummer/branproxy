package org.bran.branproxy.dto.monitor;

import lombok.Data;

/**
 * @author lizhle
 */
@Data
public class ResetMqConsumersDto {

    private String queueName;

    private Integer consumerCount;

}
