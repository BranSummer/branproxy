package org.bran.branproxy.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.common.enums.AnonymityEnum;
import org.bran.branproxy.common.enums.ProtocolEnum;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.model.ProxyBaseModel;
import org.bran.branproxy.model.ProxyModel;
import org.bran.branproxy.util.UniqueUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
@Slf4j
@Component
public class KDLInhaPageProcessor implements PageProcessor {

    @Resource
    private ProxyModelMapper proxyModelMapper;
    @Resource
    private UniqueUtil uniqueUtil;

    private static final String PROXY_XPATH = "//*[@id=\"list\"]/table/tbody/tr";

    private Site site = Site.me()
            .setDomain("https://www.kuaidaili.com/free/inha")
            .setRetryTimes(3)
            .setSleepTime(10000)
            .setCharset("utf8")
            .setUserAgent(CommonContransts.USER_AGENT);

    @Override
    public void process(Page page) {
        // 发现其他列表页
        List<String> pages = page.getHtml().links().regex(".*/free/inha/.*").all();
        page.addTargetRequests(pages);
        List<String> proxyStrs = page.getHtml().xpath(PROXY_XPATH).all();
        List<ProxyModel> proxyModels = proxyStrs.stream().map(str -> {
            ProxyModel model = new ProxyModel();
            String strVal = Jsoup.parseBodyFragment(str).body().text();
            List<String> list = Arrays.asList(strVal.split(StringUtils.SPACE));
            model.setIp(list.get(0));
            model.setPort(Integer.parseInt(list.get(1)));
            model.setAnonymity(AnonymityEnum.ELITE.getValue());
            model.setType(ProtocolEnum.getProtocolFromDesc(list.get(3)).getValue());
            model.setAddress(list.get(4));
            model.setTimeout(0);
            log.info("获取代理IP：{}", model);
            return model;
        }).filter(e -> {
            // 过滤已加入的代理
            ProxyBaseModel model = new ProxyBaseModel();
            model.setIp(e.getIp());
            model.setPort(e.getPort());
            return !uniqueUtil.isDuplicateWithSet(model);
        }).collect(Collectors.toList());
        if(CollectionUtils.isNotEmpty(proxyModels)){
            proxyModelMapper.insertBatch(proxyModels);
        }
    }

    @Override
    public Site getSite() {
        return site;
    }
}
