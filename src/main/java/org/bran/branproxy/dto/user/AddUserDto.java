package org.bran.branproxy.dto.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author lizhle
 */
@Data
public class AddUserDto {

    @NotBlank(message = "用户名不能为空")
    private String name;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotBlank(message = "邮箱不能为空")
    private String email;
}
