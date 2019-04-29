package org.bran.branproxy.service;

import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.BranproxyApplicationTests;
import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.job.crawler.KuaiDaiLiProcessor;
import org.bran.branproxy.job.crawler.XiciProcessor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PageProcessorTest extends BranproxyApplicationTests {

    @Resource
    private KuaiDaiLiProcessor kuaiDaiLiProcessor;
    @Resource
    private XiciProcessor xiciProcessor;

    @Test
    public void testKDL(){
        Site site = Site.me()
            .setDomain("https://www.kuaidaili.com/free/")
            .setRetryTimes(3)
            .setSleepTime(5000)
            .setCharset("utf8")
            .setUserAgent(CommonContransts.USER_AGENT).addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
            .addHeader("Host","www.kuaidaili.com").addHeader("Upgrade-Insecure-Requests","1");

        kuaiDaiLiProcessor.setSite(site);
        Spider.create(kuaiDaiLiProcessor).addUrl("https://www.kuaidaili.com/free/").thread(2).run();
    }

    @Test
    public void testXici() {
        Site site = Site.me()
                .setDomain("https://www.xicidaili.com/")
                .setRetryTimes(3)
                .setSleepTime(5000)
                .setCharset("utf8")
                .setUserAgent(CommonContransts.USER_AGENT)
                .addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
                .addHeader("Host","www.xicidaili.com")
                .addHeader("Upgrade-Insecure-Requests","1")
                .addHeader("Cache-Control","max-age=0");
        xiciProcessor.setSite(site);
        Spider.create(xiciProcessor).addUrl("https://www.xicidaili.com/nn/").thread(2).run();
    }

    @Test
    public void testKuaidailiJsoup() {
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

    @Test
    public void testXiciJsoup(){
        String trStr = "<tr class=\"odd\"> \n" +
                " <td class=\"country\"><img src=\"//fs.xicidaili.com/images/flag/cn.png\" alt=\"Cn\"></td> \n" +
                " <td>112.85.129.85</td> \n" +
                " <td>9999</td> \n" +
                " <td> <a href=\"/2019-04-26/jiangsu\">江苏南通</a> </td> \n" +
                " <td class=\"country\">高匿</td> \n" +
                " <td>HTTPS</td> \n" +
                " <td class=\"country\"> \n" +
                "  <div title=\"0.144秒\" class=\"bar\"> \n" +
                "   <div class=\"bar_inner fast\" style=\"width:89%\"> \n" +
                "   </div> \n" +
                "  </div> </td> \n" +
                " <td class=\"country\"> \n" +
                "  <div title=\"0.028秒\" class=\"bar\"> \n" +
                "   <div class=\"bar_inner fast\" style=\"width:98%\"> \n" +
                "   </div> \n" +
                "  </div> </td> \n" +
                " <td>1分钟</td> \n" +
                " <td>19-04-26 10:00</td> \n" +
                "</tr>";
        Document document = Jsoup.parse(trStr);
        String str =  document.body().text();
        System.out.println(str);
        List<String> list = Arrays.asList(str.split(StringUtils.SPACE));
        System.out.println(list);
    }
}