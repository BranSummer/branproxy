package org.bran.branproxy.vo.monitor;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lizhle
 */
@Data
public class GeoVo {

    private BigDecimal latitude;

    private BigDecimal longitude;

    private Integer count;
}
