package org.bran.branproxy.service.impl;

import org.apache.commons.codec.binary.Base64;
import org.bran.branproxy.common.CommonContransts;
import org.bran.branproxy.common.enums.UserStatus;
import org.bran.branproxy.common.vo.ResultResponse;
import org.bran.branproxy.dao.UserModelMapper;
import org.bran.branproxy.dto.user.AddUserDto;
import org.bran.branproxy.model.UserModel;
import org.bran.branproxy.service.IUserService;
import org.bran.branproxy.vo.BasePageVo;
import org.bran.branproxy.vo.user.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author lizhle
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService implements IUserService {

    private static final String MAIL_FROM = "1121268624@qq.com";
    private static final String MAIL_TEMPLATE = "%s，您好，您的最新的API_KEY为%s，请妥善保存";

    @Resource
    private UserModelMapper userModelMapper;
    @Resource
    private JavaMailSender mailSender;

    @Override
    public List<UserVo> getUserList() {
        return userModelMapper.queryUserModel(UserModel.QueryBuild().isDelete(CommonContransts.NOT_DELETE).build())
                .stream().map(e->{
                    UserVo vo = new UserVo();
                    BeanUtils.copyProperties(e,vo);
                    vo.setStatusName(UserStatus.getDescFromValue(e.getStatus()));
                    return vo;
                }).collect(Collectors.toList());
    }

    @Override
    public ResultResponse saveUser(AddUserDto dto) {
        UserModel nameUser = userModelMapper.queryUserModelLimit1(UserModel.QueryBuild()
                .isDelete(CommonContransts.NOT_DELETE).title(dto.getName()).build());
        if(Objects.nonNull(nameUser)){
            return ResultResponse.buildFail("用户名已存在");
        }
        UserModel emailUser = userModelMapper.queryUserModelLimit1(UserModel.QueryBuild()
                .isDelete(CommonContransts.NOT_DELETE).email(dto.getEmail()).build());
        if(Objects.nonNull(emailUser)){
            return ResultResponse.buildFail("邮箱已被使用");
        }
        UserModel userModel = new UserModel();
        userModel.setTitle(dto.getName());
        userModel.setPwd(dto.getPassword());
        userModel.setEmail(dto.getEmail());
        userModel.setStatus(UserStatus.ENABLE.getValue());
        userModelMapper.insertUserModel(userModel);
        return ResultResponse.buildSuccess();
    }

    @Override
    public void resetApiKey(Long uid) {
        long timestamp = System.currentTimeMillis();
        long factor = timestamp + uid;
        String apiKey = Long.toHexString(factor);
        UserModel userModel = userModelMapper.queryUserModelLimit1(UserModel.QueryBuild().id(uid).build());
        userModelMapper.update(UserModel.UpdateBuild()
                .set(UserModel.Build().apiKey(apiKey).build())
                .where(UserModel.ConditionBuild().idList(uid)).build());
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("API KEY 确认邮件");
        message.setText(String.format(MAIL_TEMPLATE,userModel.getTitle(),apiKey));
        message.setTo(userModel.getEmail());
        message.setFrom(MAIL_FROM);
        mailSender.send(message);
    }

    @Override
    public UserModel getUserByUid(long uid) {
        return userModelMapper.queryUserModelLimit1(UserModel.QueryBuild().id(uid).build());
    }
}
