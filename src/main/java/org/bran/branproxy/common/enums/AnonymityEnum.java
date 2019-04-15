package org.bran.branproxy.common.enums;

/**
 * @author lizhle
 */
public enum AnonymityEnum {

    TRANSPARENT(1,"透明代理"),

    ANONYMOUS(2,"匿名代理"),

    DISTORTING(3,"混淆代理"),

    ELITE(4,"高匿代理")

    ;

    private Integer value;

    private String desc;

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    AnonymityEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }


}
