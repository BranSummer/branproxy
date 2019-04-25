package org.bran.branproxy.job.crawler;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.bran.branproxy.common.enums.AnonymityEnum;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.model.ProxyBaseModel;
import org.bran.branproxy.util.UniqueUtil;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import javax.annotation.Resource;
import java.util.ArrayList;
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
        List<String> proxyStrs = page.getHtml().xpath(PROXY_XPATH).all();

        List<IpProxyModel> ipProxyModels = new ArrayList<>();
        for (int i = 1; i < proxyStrs.size(); i++) {
            // 过滤已加入的代理
            ProxyBaseModel model = new ProxyBaseModel();
            model.setIp(proxyStrs.get(0));
            model.setPort(Integer.parseInt(proxyStrs.get(1)));
            if(!uniqueUtil.isDuplicateWithSet(model)){
                IpProxyModel proxyModel = new IpProxyModel();
                proxyModel.setIp(proxyStrs.get(0));
                proxyModel.setPort(Integer.parseInt(proxyStrs.get(1)));
                proxyModel.setAddress(proxyStrs.get(2));
                proxyModel.setAnonymity(getAnonymity(proxyStrs.get(3)));
                proxyModel.setType(getProtocolType(proxyStrs.get(4)));
                proxyModel.setTimeout(0);
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
        }else if(anonymityStr.equalsIgnoreCase("")){
        }
        return 0;
    }

    /**
     * TODO
     * @param typeStr
     * @return
     */
    private int getProtocolType(String typeStr){
        return 0;
    }
}
