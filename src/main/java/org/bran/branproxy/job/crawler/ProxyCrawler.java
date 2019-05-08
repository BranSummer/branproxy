package org.bran.branproxy.job.crawler;

import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.job.crawler.processor.KuaiDaiLiProcessor;
import org.bran.branproxy.job.crawler.processor.XiciProcessor;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Service
@Slf4j
public class ProxyCrawler {
    @Resource
    private KuaiDaiLiProcessor kuaiDaiLiProcessor;
    @Resource
    private XiciProcessor xiciProcessor;

    public void crawlFromKuaiDaili(){
        Site site = Site.me()
                .setDomain("https://www.kuaidaili.com/free/")
                .setRetryTimes(3)
                .setSleepTime(5000)
                .setCharset("utf8")
                .setUserAgent(CommonContransts.USER_AGENT)
                .addHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3")
                .addHeader("Host","www.kuaidaili.com").addHeader("Upgrade-Insecure-Requests","1");

        kuaiDaiLiProcessor.setSite(site);
        Spider.create(kuaiDaiLiProcessor).addUrl("https://www.kuaidaili.com/free/").thread(1).run();
    }

    public void crawlFromXici(){
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
        Spider.create(xiciProcessor).addUrl("https://www.xicidaili.com/nn/").thread(1).run();
    }

    public void crawlFrom31f(){
        // TODO
    }

    public void crawlFromNima(){
        // TODO
    }

    public void crawlFromXila(){
        // TODO
    }

    public void crawlFrom89Ip(){
        // TODO
    }
}
