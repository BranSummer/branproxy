package org.bran.branproxy.job.crawler;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.common.enums.AnonymityEnum;
import org.bran.branproxy.common.enums.ProtocolEnum;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.model.ProxyBaseModel;
import org.bran.branproxy.util.UniqueUtil;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lizhle
 */
@Slf4j
@Data
@Component
public class XiciProcessor implements PageProcessor {

    @Resource
    private IpProxyModelMapper ipProxyModelMapper;
    @Resource
    private UniqueUtil uniqueUtil;

    private static final String PROXY_XPATH = "//*[@id=\"ip_list\"]/tbody/tr";

    private Site site;

    @Override
    public void process(Page page) {
        // 发现其他列表页
        List<String> pages = page.getHtml().links().regex(".*/nn/.*").all();
        pages.addAll(page.getHtml().links().regex(".*/nt/.*").all());
        pages.addAll(page.getHtml().links().regex(".*/wn/.*").all());
        pages.addAll(page.getHtml().links().regex(".*/wt/.*").all());
        page.addTargetRequests(pages);
        List<String> proxyStrs = page.getHtml().xpath(PROXY_XPATH).all();



        List<IpProxyModel> ipProxyModels = new ArrayList<>();
        for (int i = 1; i < proxyStrs.size(); i++) {

            String strVal = Jsoup.parseBodyFragment(proxyStrs.get(i)).body().text();
            List<String> list = Arrays.asList(strVal.split(StringUtils.SPACE));

            // 过滤已加入的代理
            ProxyBaseModel model = new ProxyBaseModel();
            model.setIp(list.get(0));
            model.setPort(Integer.parseInt(list.get(1)));
            if(!uniqueUtil.isDuplicateWithSet(model)){
                IpProxyModel proxyModel = new IpProxyModel();
                proxyModel.setIp(list.get(0));
                proxyModel.setPort(Integer.parseInt(list.get(1)));
                proxyModel.setAddress(list.get(2));
                proxyModel.setAnonymity(getAnonymity(list.get(3)));
                proxyModel.setType(getProtocolType(list.get(4)));
                ipProxyModels.add(proxyModel);
            }
        }
        ipProxyModelMapper.insertBatch(ipProxyModels);
    }

    @Override
    public Site getSite() {
        return site;
    }

    /**
     * TODO
     * @param anonymityStr
     * @return
     */
    private int getAnonymity(String anonymityStr){
        if(anonymityStr.equalsIgnoreCase("高匿")){
            return AnonymityEnum.ELITE.getValue();
        }else if(anonymityStr.equalsIgnoreCase("透明")){
            return AnonymityEnum.TRANSPARENT.getValue();
        }else {
            return 0;
        }
    }

    /**
     * @param typeStr
     * @return
     */
    private int getProtocolType(String typeStr){
        switch (typeStr){
            case "HTTPS":
                return ProtocolEnum.HTTPS.getValue();
            case "HTTP":
                return ProtocolEnum.HTTP.getValue();
            case "socks4/5":
                return ProtocolEnum.SOCKS.getValue();
            default:
                return ProtocolEnum.UNKNOW.getValue();
        }

    }
}
