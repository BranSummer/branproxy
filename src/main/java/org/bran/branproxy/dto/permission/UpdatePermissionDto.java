package org.bran.branproxy.dto.permission;

import lombok.Data;

/**
 * @author lizhle
 */
@Data
public class UpdatePermissionDto {

    /**
     * 主键
     *
     * isNullAble:0
     */
    private Long id;

    /**
     *
     * isNullAble:0
     */
    private Long pid;

    /**
     *
     * isNullAble:0,defaultVal:
     */
    private String title;

    /**
     *
     * isNullAble:0,defaultVal:
     */
    private String code;
}
