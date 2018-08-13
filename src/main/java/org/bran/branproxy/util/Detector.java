package org.bran.branproxy.util;

import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.model.ProxyModel;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.*;

@Component
@Slf4j
public class Detector {

    public boolean isAvailable(ProxyModel proxyModel) {
        String url = "https://www.baidu.com";
        Document doc=null;

        Connection con=Jsoup.connect(url);
        con.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.99 Safari/537.36");
        con.proxy(proxyModel.getIp(),proxyModel.getPort());

        try {
            doc = con.get();
            System.out.println(doc.title());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        ProxyModel proxyModel = new ProxyModel();
        proxyModel.setIp("125.62.26.197");
        proxyModel.setPort(3128);

        boolean test = new Detector().isAvailable(proxyModel);
        System.out.println(test);
    }
}
