package org.bran.branproxy.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lizhle
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SelectScheduleJobDto extends BasePageQuery {

    private String beanName;
}
