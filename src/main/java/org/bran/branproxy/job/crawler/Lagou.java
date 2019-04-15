package org.bran.branproxy.job.crawler;

import org.bran.branproxy.common.CommonContransts;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.List;

/**
 * @author lizhle
 */
public class Lagou implements PageProcessor {

    private static final String ITEM_PATH = "//*[@id=\"s_position_list\"]/ul/li";

    private Site site = Site.me()
            .setDomain("https://www.lagou.com/zhaopin/Java/")
            .setRetryTimes(3)
            .setSleepTime(10000)
            .setCharset("utf8")
            .setUserAgent(CommonContransts.USER_AGENT);

    @Override
    public void process(Page page) {

        List<String> ipStrs = page.getHtml().xpath(ITEM_PATH).all();

    }

    @Override
    public Site getSite() {
        return site;
    }
}
