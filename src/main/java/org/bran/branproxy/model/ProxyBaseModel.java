package org.bran.branproxy.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * @author lizhle
 */
@Data
@Slf4j
public class ProxyBaseModel {

    private String ip;

    private Integer port;

    public String toJson(){
        ObjectMapper objectMapper = new ObjectMapper();
        String json = StringUtils.EMPTY;

        try {
            json= objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            log.error("序列化失败,{}",e.getMessage());
        }
        return json;
    }
}
