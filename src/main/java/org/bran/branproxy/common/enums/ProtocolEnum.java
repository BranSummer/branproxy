package org.bran.branproxy.common.enums;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-23 16:56
 * @Description:
 */
public enum ProtocolEnum {

    HTTP(1, "http"),

    HTTPS(2, "https"),

    SOCKS(3, "socks"),

    FTP(4, "ftp"),

    TELNET(5, "telnet"),

    POP3(6, "pop3"),

    UNKNOW(7, "未知");


    private Integer value;

    private String desc;

    ProtocolEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDescFromValue(int value) {
        for (ProtocolEnum protocolEnum : ProtocolEnum.values()) {
            if (protocolEnum.getValue() == value) {
                return protocolEnum.getDesc();
            }
        }
        return UNKNOW.getDesc();
    }

    public static ProtocolEnum getProtocolFromDesc(String desc) {
        if (StringUtils.isBlank(desc)) {
            return UNKNOW;
        }
        for (ProtocolEnum protocolEnum : ProtocolEnum.values()) {
            if (protocolEnum.getDesc().equalsIgnoreCase(desc)) {
                return protocolEnum;
            }
        }
        return UNKNOW;
    }
}


