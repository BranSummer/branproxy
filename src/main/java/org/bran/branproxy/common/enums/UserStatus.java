package org.bran.branproxy.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author lizhle
 */
public enum UserStatus {

    ENABLE(1,"启用"),

    DISABLE(2,"禁用");

    private Integer value;

    private String desc;

    UserStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescFromValue(int value){
        for (UserStatus userStatus : UserStatus.values()) {
            if(userStatus.getValue().equals(value)){
                return userStatus.getDesc();
            }
        }
        return StringUtils.EMPTY;
    }
}
