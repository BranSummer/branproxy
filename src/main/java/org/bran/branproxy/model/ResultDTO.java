package org.bran.branproxy.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Auther: BranSummer
 * @Date: 2018-10-7 22:02
 * @Description:
 */
@Getter
@Setter
@ToString
public class ResultDTO {

    private Integer status;

    private String message;

    private Object data;
}
