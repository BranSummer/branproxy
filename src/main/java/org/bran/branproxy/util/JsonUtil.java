package org.bran.branproxy.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author lizhle
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T praseJson(String json, Class<T> tClass) {
        T t = null;
        try {
            t = objectMapper.readValue(json, tClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }
}
