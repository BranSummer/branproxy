package org.bran.branproxy.util;

import lombok.extern.slf4j.Slf4j;

import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.model.ProxyModel;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;


/**
 * IP验证工具
 *
 * @author lizhile
 */
@Component
@Slf4j
public class DetectUtil {

    private static final String BAIDU_URL = "https://www.baidu.com";

    public static int detectOnBaidu(ProxyModel proxyModel) {

        Connection con=Jsoup.connect(BAIDU_URL);
        con.proxy(proxyModel.getIp(),proxyModel.getPort());
        con.userAgent(CommonContransts.USER_AGENT);
        long start = System.currentTimeMillis();
        try {
            con.get();
        } catch (IOException e) {
            log.info("此代理无效");
            return -1;
        }
        long end = System.currentTimeMillis();

        return (int)(end - start);
    }


    public static void main(String[] args) {
        ProxyModel proxyModel = new ProxyModel();
        proxyModel.setIp("61.189.242.243");
        proxyModel.setPort(55484);
        System.out.println(DetectUtil.detectOnBaidu(proxyModel));
    }
}
