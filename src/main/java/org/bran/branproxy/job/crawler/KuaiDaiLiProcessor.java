package org.bran.branproxy.job.crawler;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.common.enums.AnonymityEnum;
import org.bran.branproxy.common.enums.ProtocolEnum;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.dao.ProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
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
 * @Author: BranSummer
 * @Date: 2019-2-23 18:04
 * @Description: 快代理
 */
@Slf4j
@Data
@Component
public class KuaiDaiLiProcessor implements PageProcessor {

    @Resource
    private IpProxyModelMapper ipProxyModelMapper;
    @Resource
    private UniqueUtil uniqueUtil;

    private static final String PROXY_XPATH = "//*[@id=\"list\"]/table/tbody/tr";

    private Site site;


    @Override
    public void process(Page page) {
        // 发现其他列表页
        List<String> pages = page.getHtml().links().regex(".*/free/intr/.*").all();
        pages.addAll(page.getHtml().links().regex(".*/free/inha/.*").all());
        page.addTargetRequests(pages);
        List<String> proxyStrs = page.getHtml().xpath(PROXY_XPATH).all();
        List<IpProxyModel> ipProxyModels = proxyStrs.stream().map(str -> {
            IpProxyModel model = new IpProxyModel();
            String strVal = Jsoup.parseBodyFragment(str).body().text();
            List<String> list = Arrays.asList(strVal.split(StringUtils.SPACE));
            model.setIp(list.get(0));
            model.setPort(Integer.parseInt(list.get(1)));
            model.setAnonymity(getAnonymity(list.get(2)));
            model.setType(ProtocolEnum.getProtocolFromDesc(list.get(3)).getValue());
            model.setAddress(list.get(4) + StringUtils.SPACE + list.get(5));
            model.setTimeout(0);
            return model;
        }).filter(e -> {
            // 过滤已加入的代理
            ProxyBaseModel model = new ProxyBaseModel();
            model.setIp(e.getIp());
            model.setPort(e.getPort());
            return !uniqueUtil.isDuplicateWithSet(model);
        }).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(ipProxyModels)) {
            log.info("新增代理:{}",ipProxyModels);
            ipProxyModelMapper.insertBatch(ipProxyModels);
        }
    }

    @Override
    public Site getSite() {
        return site;
    }

    private int getAnonymity(String anonymityStr) {
        if (anonymityStr.contains("高匿名")) {
            return AnonymityEnum.ELITE.getValue();
        } else if (anonymityStr.contains("透明")) {
            return AnonymityEnum.TRANSPARENT.getValue();
        } else {
            return 0;
        }
    }
}
