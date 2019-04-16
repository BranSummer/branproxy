package org.bran.branproxy.util;

import org.bran.branproxy.common.RedisConstants;
import org.bran.branproxy.model.ProxyBaseModel;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
@Component
public class UniqueUtil {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public boolean isDuplicateWithSet(ProxyBaseModel proxyBaseModel) {
        long value = stringRedisTemplate.opsForSet().add(RedisConstants.UNIQUE_PROXY_SET,proxyBaseModel.toJson());
        return value == 0L;
    }

    /**
     * 判断新加入的代理是否重复
     *
     * @param proxyBaseModel ProxyBaseModel
     * @return 重复:true, 不重复：false
     */
    public boolean isDuplicateWithHyperLogLog(ProxyBaseModel proxyBaseModel){
        // 返回为0表示已存在，重复； 不为0即不重复
        long value = stringRedisTemplate.opsForHyperLogLog().add(RedisConstants.UNIQUE_KEY, proxyBaseModel.toJson());
        return  value == 0L;
    }

    public Long addAll(List<ProxyBaseModel> proxyBaseModels) {
        List<String> modelStrs = proxyBaseModels.stream().map(ProxyBaseModel::toJson).collect(Collectors.toList());
        String[] modelStrArray =new String[modelStrs.size()];
        return stringRedisTemplate.opsForHyperLogLog().add(RedisConstants.UNIQUE_KEY, modelStrs.toArray(modelStrArray));
    }

    public Long getUniqueSize(){
        return stringRedisTemplate.opsForHyperLogLog().size(RedisConstants.UNIQUE_KEY);
    }
}
