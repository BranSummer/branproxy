package org.bran.branproxy.mq.payload;

import lombok.Data;
import org.bran.branproxy.model.IpProxyModel;

import java.io.Serializable;

/**
 * @author lizhle
 */
@Data
public class CheckPayload implements Serializable {

    private String redisKey;

    private String destination;

    private IpProxyModel ipProxyModel;
}
