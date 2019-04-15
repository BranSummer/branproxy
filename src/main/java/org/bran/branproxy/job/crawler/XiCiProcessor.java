package org.bran.branproxy.job.crawler;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-16 21:49
 * @Description:
 */
public class XiCiProcessor implements PageProcessor {
    @Override
    public void process(Page page) {
//        page.addTargetRequest("https://www.xicidaili.com/nn/");
//        List<String> pages = page.getHtml().links().regex(".*/nn/.*").all();
//        System.out.println(pages);
//        page.addTargetRequests(pages);
        String xpath = "//*[@id=\"ip_list\"]/tbody/tr/td[2]/text()";
        System.out.println(page.getHtml().xpath(xpath).all());
        //sad


    }

    @Override
    public Site getSite() {
        return Site.me().setRetryTimes(3).setRetrySleepTime(1);
    }

    public static void main(String[] args) {
        Spider.create(new XiCiProcessor()).addUrl("https://www.xicidaili.com/nn/").thread(1).run();
    }
}
