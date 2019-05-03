package org.bran.branproxy.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author lizhle
 */
@Data
@NoArgsConstructor
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
