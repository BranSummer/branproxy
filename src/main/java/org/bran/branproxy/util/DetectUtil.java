package org.bran.branproxy.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.model.ProxyModel;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * IP验证工具
 *
 * @author lizhile
 */
@Slf4j
@Component
public class DetectUtil {

    public static final String BAIDU_URL = "https://www.baidu.com";

    public static final String GOOGLE_URL = "https://www.google.com";

    public int detect(ProxyModel proxyModel, String detectUrl) {
        long start = System.currentTimeMillis();
        // 创建http get实例
        HttpGet httpGet=new HttpGet(detectUrl);
        CloseableHttpClient client = setProxy(httpGet, proxyModel.getIp(), proxyModel.getPort());
        //设置请求头消息
        httpGet.setHeader("User-Agent",CommonContransts.USER_AGENT);
        // 执行http get请求
        try {
            CloseableHttpResponse response=client.execute(httpGet);
            if (response != null){
                if(response.getStatusLine().getStatusCode() != HttpStatus.SC_OK){
                    return -1;
                }
            }
        } catch (IOException e) {
            log.info("{}此代理无效,error = {}",proxyModel,e.getMessage());
            return -1;
        }
        long end = System.currentTimeMillis();
        return (int) (end - start);
    }

    public  int detect(ProxyModel proxyModel) {
        return detect(proxyModel,BAIDU_URL);
    }



    private  CloseableHttpClient setProxy(HttpGet httpGet, String proxyIp, int proxyPort){
        // 创建httpClient实例
        CloseableHttpClient httpClient= HttpClients.createDefault();
        //设置代理IP、端口
        HttpHost proxy=new HttpHost(proxyIp,proxyPort,"http");
        //也可以设置超时时间
        RequestConfig requestConfig=RequestConfig.custom().setProxy(proxy).setConnectTimeout(10000).build();
        httpGet.setConfig(requestConfig);
        return httpClient;
    }

}
