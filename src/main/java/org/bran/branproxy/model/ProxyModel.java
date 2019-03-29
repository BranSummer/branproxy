package org.bran.branproxy.model;

import lombok.Data;

/**
 * @author lizhle
 */
@Data
public class ProxyModel {

    private Long id;

    private String ip;

    private int port;

    private String district;

    private Integer timeout;

    private Integer typeId;

    private Integer anonymity;
}
