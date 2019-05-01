package org.bran.branproxy.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.Objects;

/**
 * @author lizhle
 */
@Slf4j
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T praseJson(String json, Class<T> tClass) {
        T t = null;
        try {
            t = objectMapper.readValue(json, tClass);
        } catch (IOException e) {
            log.error("json反序列化失败,{}",e);
        }
        return t;
    }

    public static String toJson(Object object){
        if(Objects.isNull(object)){
            return StringUtils.EMPTY;
        }
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("json序列化失败,{}",e);
        }
        return StringUtils.EMPTY;
    }
}