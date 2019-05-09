package org.bran.branproxy.aspect;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.model.UserModel;
import org.bran.branproxy.service.IUserService;
import org.bran.branproxy.util.JsonUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author lizhle
 */
@Component
@Aspect
@Slf4j
public class ApiAspect {

    @Resource
    private IUserService userService;

    /**
     * 是否开启签名
     */
    @Value("${api.sign.enable}")
    private boolean signEnable;
    @Value("${api.sign.timeout}")
    private long signTimeout;

    @Pointcut("execution(public * org.bran.branproxy.controller.ApiController.*(..))")
    public void proxyApi(){}

    @Around("proxyApi()")
    public Object checkSign(ProceedingJoinPoint pjp) throws Throwable {
        //是否开启签名
        if(!signEnable){
            return pjp.proceed();
        }
        //获取所有请求参数
        Object[] args = pjp.getArgs();
        if(args == null || args.length==0){
            return ResultResponse.buildFail("签名错误");
        }
        // 请求参数数组转map
        Map<String,Object> paramMap = (Map<String,Object>)args[0];
        if(Objects.isNull(paramMap)){
            return ResultResponse.buildFail("请求参数异常");
        }
        //检查是否包含时间戳:timestamp, uid, ApiKey
        if(paramMap.get("timestamp") == null || paramMap.get("uid") == null || paramMap.get("sign") == null){
            return ResultResponse.buildFail("签名参数不完整");
        }
        // now - timestamp >timeout -> 签名超时
        long timestamp = (long)paramMap.get("timestamp");
        long now = System.currentTimeMillis();
        if(now - timestamp > signTimeout){
            return ResultResponse.buildFail("当前签名已过期");
        }
        // 根据userId 获取ApiKey
        long uid = (int)paramMap.get("uid");
        UserModel userModel = userService.getUserByUid(uid);
        // 验证签名
        if(!isSignValid(paramMap,userModel.getApiKey())){
            return ResultResponse.buildFail("签名校验失败");
        }
        // 放行
        return pjp.proceed();
    }

    private boolean isSignValid(Map paramMap, String apiKey){
        String signInput = (String) paramMap.get("sign");
        List<String> signatureFactors = new ArrayList<>();
        for (Object k : paramMap.keySet()) {
            if(paramMap.get(k) == null || k.equals("sign")){
                continue;
            }
            signatureFactors.add(k.toString()+ JsonUtil.toJson(paramMap.get(k)));
        }
        Collections.sort(signatureFactors);
        StringBuilder sb = new StringBuilder();
        signatureFactors.forEach(sb::append);
        String trueSign = DigestUtils.md5DigestAsHex(sb.toString().getBytes());
        return signInput.equalsIgnoreCase(trueSign);
    }
}
