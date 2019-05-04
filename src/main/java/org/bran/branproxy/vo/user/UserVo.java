package org.bran.branproxy.vo.user;

import lombok.Data;

/**
 * @author lizhle
 */
@Data
public class UserVo {

    private Long id;

    private String title;

    private String email;

    private String apiKey;

    private String statusName;

    private String lastLoginAddress;
}
