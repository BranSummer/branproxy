package org.bran.branproxy.job.crawler;

import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.common.CommonContransts;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @Auther: BranSummer
 * @Date: 2019-2-23 18:04
 * @Description:
 */
@Slf4j
public class KuaiDaiLiProcessor implements PageProcessor {

    private Site site = Site.me()
            .setRetryTimes(3)
            .setSleepTime(10000)
            .setCharset("utf8")
            .setUserAgent(CommonContransts.USER_AGENT);

    @Override
    public void process(Page page) {

    }

    @Override
    public Site getSite() {
        return site;
    }
}
