package org.bran.branproxy.service;

import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.BranproxyApplicationTests;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import us.codecraft.webmagic.Spider;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class KDLInhaPageProcessorTest extends BranproxyApplicationTests {

    @Resource
    private KDLInhaPageProcessor pageProcessor;

    @Test
    public void testKDL(){
        Spider.create(pageProcessor).addUrl("https://www.kuaidaili.com/free/inha").thread(10).run();
    }

    @Test
    public void testJsoup() {
        Document document = Jsoup.parse("<tr> \n" +
                " <td data-title=\"IP\">163.125.235.182</td> \n" +
                " <td data-title=\"PORT\">8118</td> \n" +
                " <td data-title=\"匿名度\">高匿名</td> \n" +
                " <td data-title=\"类型\">HTTP</td> \n" +
                " <td data-title=\"位置\">广东省深圳市 联通</td> \n" +
                " <td data-title=\"响应速度\">3秒</td> \n" +
                " <td data-title=\"最后验证时间\">2019-04-14 07:30:53</td> \n" +
                "</tr>");
        String str =  document.body().text();
        System.out.println(str);
        List<String> list = Arrays.asList(str.split(StringUtils.SPACE));
        System.out.println(list);
    }
}