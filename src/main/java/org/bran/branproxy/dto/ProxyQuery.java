package org.bran.branproxy.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author lizhle
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ProxyQuery extends BasePageQuery {

    /**
     * 主键
     *
     * isNullAble:0
     */
    private Long id;

    /**
     * ip
     * isNullAble:0,defaultVal:
     */
    private String ip;

    /**
     * 端口
     * isNullAble:0,defaultVal:0
     */
    private Integer port;

    /**
     * 状态
     * isNullAble:0,defaultVal:0
     */
    private Integer status;

    /**
     * 地址
     * isNullAble:0,defaultVal:
     */
    private String address;

    /**
     * 匿名度
     * isNullAble:0,defaultVal:0
     */
    private Integer anonymity;

    /**
     * 类型
     * isNullAble:0,defaultVal:0
     */
    private Integer type;

    /**
     * 响应时间
     * isNullAble:0,defaultVal:0
     */
    private Integer timeout;

    /**
     * 国外响应时间
     * isNullAble:0,defaultVal:-1
     */
    private Integer timeoutAbroad;

    /**
     * 最新更新时间
     * isNullAble:0,defaultVal:0000-00-00 00:00:00
     */
    private java.time.LocalDateTime lastUpdateTime;

    /**
     * 经度
     * isNullAble:0,defaultVal:0.0000
     */
    private java.math.BigDecimal latitude;

    /**
     * 纬度
     * isNullAble:0,defaultVal:0.0000
     */
    private java.math.BigDecimal longitude;
}
