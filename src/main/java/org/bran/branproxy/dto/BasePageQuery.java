package org.bran.branproxy.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Objects;

/**
 * @author lizhle
 */
@Data
@Builder
public class BasePageQuery {

    private Integer page;

    private Integer limit;

    private Integer offset;

    public Integer getOffset() {
        if (Objects.nonNull(page) && Objects.nonNull(limit)) {
            return (page - 1) * limit;
        }
        return 0;
    }
}
