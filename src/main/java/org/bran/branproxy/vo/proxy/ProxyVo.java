package org.bran.branproxy.vo.proxy;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author lizhle
 */
@Data
public class ProxyVo {

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
     * 匿名度名称
     */
    private String anonymityName;

    /**
     * 类型
     * isNullAble:0,defaultVal:0
     */
    private Integer type;

    /**
     * 代理类型名称
     */
    private String typeName;

    /**
     * 响应时间
     * isNullAble:0,defaultVal:0
     */
    private Integer timeout;

    /**
     * 最新更新时间
     * isNullAble:0,defaultVal:0000-00-00 00:00:00
     */
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private java.time.LocalDateTime lastUpdateTime;

}
