package org.bran.branproxy.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Setter
@Getter
@EqualsAndHashCode(exclude = "timeout")
@Slf4j
public class ProxyModel {

    private String ip;

    private String port;

    private int timeout;

    public String toJson(){
        ObjectMapper mapper =new ObjectMapper();
        String json =null;

        try {
            json = mapper .writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            log.debug("序列化失败");
        }
        return json;
    }

    public static ProxyModel praseJson(String json){
        ObjectMapper mapper = new ObjectMapper();
        ProxyModel proxyModel = null;
        try {
            proxyModel =mapper.readValue(json,ProxyModel.class);
        } catch (IOException e) {
            e.printStackTrace();
            log.debug("反序列化失败");
        }
        return proxyModel;
    }

    public static void main(String[] args) {
        ProxyModel proxyModel =new ProxyModel();
        proxyModel.setIp("127.0.0.1");
        proxyModel.setPort("9999");
        proxyModel.setTimeout(0);

        System.out.println(proxyModel.toJson());
    }
}
