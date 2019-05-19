package org.bran.branproxy.util;

import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

import java.io.IOException;

import static org.junit.Assert.*;

public class DetectUtilTest extends BranproxyApplicationTests {

    @Resource
    private DetectUtil detectUtil;
    @Resource
    private ProxyModelMapper proxyModelMapper;
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void detect() {

    }

    @Test
    public void detectZhihu(){
        /*Document doc=null;
        Connection con= Jsoup.connect("https://www.zhihu.com/collection/100349534");

        try {
            doc=con.get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(doc.body().text());*/
    }
}