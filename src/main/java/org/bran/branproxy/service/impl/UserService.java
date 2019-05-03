package org.bran.branproxy.service.impl;

import org.apache.commons.codec.binary.Base64;
import org.bran.branproxy.dao.UserModelMapper;
import org.bran.branproxy.model.UserModel;
import org.bran.branproxy.service.IUserService;
import org.bran.branproxy.vo.BasePageVo;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService implements IUserService {

    private static final String MAIL_FROM = "1121268624@qq.com";
    private static final String MAIL_TEMPLATE = "%s，你好，您的最新的API_KEY为%s，请妥善保存";

    @Resource
    private UserModelMapper userModelMapper;
    @Resource
    private JavaMailSender mailSender;

    @Override
    public BasePageVo getUserList() {
        return null;
    }

    @Override
    public void resetApiKey(Long uid) {
        long timestamp = System.currentTimeMillis();
        String factor = String.valueOf(timestamp) + uid;
        String apiKey = new String(Base64.encodeBase64(factor.getBytes()));
        UserModel userModel = userModelMapper.queryUserModelLimit1(UserModel.QueryBuild().id(uid).build());
        userModelMapper.update(UserModel.UpdateBuild()
                .set(UserModel.Build().apiKey(apiKey).build())
                .where(UserModel.ConditionBuild().idList(uid).build()).build());
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("API KEY 确认邮件");
        message.setText(String.format(MAIL_TEMPLATE,userModel.getTitle(),apiKey));
        message.setTo(userModel.getEmail());
        message.setFrom(MAIL_FROM);
        mailSender.send(message);
    }
}
