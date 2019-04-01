package org.bran.branproxy.dto.permission;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author lizhle
 */
@Data
public class AddPermissionDto {

    /**
     *
     * isNullAble:0
     */
    @NotNull
    private Long pid;

    /**
     *
     * isNullAble:0,defaultVal:
     */
    @NotBlank
    private String title;

    /**
     *
     * isNullAble:0,defaultVal:
     */
    @NotBlank
    private String code;
}
