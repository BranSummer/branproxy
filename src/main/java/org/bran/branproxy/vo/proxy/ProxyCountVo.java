package org.bran.branproxy.vo.proxy;

import lombok.Data;

/**
 * @author lizhle
 */
@Data
public class ProxyCountVo {

    private Integer totalCount;

    private Integer eliteCount;

    private Integer transparentCount;

    private Integer httpsCount;
}
