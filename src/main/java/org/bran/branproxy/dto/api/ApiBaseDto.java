package org.bran.branproxy.dto.api;

import lombok.Data;

/**
 * @author lizhle
 */
@Data
public class ApiBaseDto {

    private Long uid;

    private String sign;

    /**
     * 13位时间戳
     */
    private Long timestamp;
}
