package org.bran.branproxy.job.crawler;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.bran.branproxy.common.enums.AnonymityEnum;
import org.bran.branproxy.common.enums.ProtocolEnum;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dao.IpProxyModelMapper;
import org.bran.branproxy.model.IpProxyModel;
import org.bran.branproxy.model.ProxyBaseModel;
import org.bran.branproxy.util.JsonUtil;
import org.bran.branproxy.util.PageUtil;
import org.bran.branproxy.util.UniqueUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author lizhle
 */
@Component
public class Fate0Source {

    private static final String URL = "https://raw.githubusercontent.com/fate0/proxylist/master/proxy.list";

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private IpProxyModelMapper ipProxyModelMapper;
    @Resource
    private UniqueUtil uniqueUtil;

    public ResultResponse getFromFateZero() {
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(URL, String.class);
        if (Objects.isNull(responseEntity) || !responseEntity.getStatusCode().equals(HttpStatus.OK)) {
            return ResultResponse.buildFail("接口调用失败");
        }
        String proxyStr = responseEntity.getBody();
        if (StringUtils.isBlank(proxyStr)) {
            return ResultResponse.buildFail("接口返回失败");
        }
        String[] proxyJsons = proxyStr.split("\n");
        List<IpProxyModel> ipProxyModels = new ArrayList<>();
        for (String proxyJson : proxyJsons) {
            HashMap map = JsonUtil.praseJson(proxyJson, HashMap.class);
            ProxyBaseModel baseModel = new ProxyBaseModel();
            baseModel.setIp((String) map.get("host"));
            baseModel.setPort((int) map.get("port"));
            if (!uniqueUtil.isDuplicateWithSet(baseModel)) {
                IpProxyModel proxyModel = new IpProxyModel();
                proxyModel.setIp((String) map.get("host"));
                proxyModel.setPort((int) map.get("port"));
                proxyModel.setAddress((String) map.get("country"));
                proxyModel.setAnonymity(getAnonymity((String) map.get("anonymity")));
                proxyModel.setType(getType((String) map.get("type")));
                ipProxyModels.add(proxyModel);
            }
        }
        if (CollectionUtils.isNotEmpty(ipProxyModels)) {
            List<List<IpProxyModel>> partList = PageUtil.getGroupedListWithPaged(ipProxyModels, 500);
            partList.forEach(list -> ipProxyModelMapper.insertBatch(list));
        }
        return ResultResponse.buildSuccess();
    }

    private int getAnonymity(String anonymityStr) {
        switch (anonymityStr) {
            case "high_anonymous":
                return AnonymityEnum.ELITE.getValue();
            case "anonymous":
                return AnonymityEnum.ANONYMOUS.getValue();
            default:
                return AnonymityEnum.TRANSPARENT.getValue();
        }
    }

    private int getType(String typeStr) {
        switch (typeStr) {
            case "http":
                return ProtocolEnum.HTTP.getValue();
            case "https":
                return ProtocolEnum.HTTPS.getValue();
            default:
                return ProtocolEnum.UNKNOW.getValue();
        }
    }
}
