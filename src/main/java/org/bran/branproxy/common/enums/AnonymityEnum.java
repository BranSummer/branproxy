package org.bran.branproxy.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @author lizhle
 */
public enum AnonymityEnum {

    TRANSPARENT(1, "透明代理"),

    ANONYMOUS(2, "匿名代理"),

    DISTORTING(3, "混淆代理"),

    ELITE(4, "高匿代理");

    private Integer value;

    private String desc;

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescFromValue(int value) {
        for (AnonymityEnum anonymityEnum : AnonymityEnum.values()) {
            if (anonymityEnum.getValue() == value) {
                return anonymityEnum.getDesc();
            }
        }
        return "其他";
    }

    AnonymityEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }


}
