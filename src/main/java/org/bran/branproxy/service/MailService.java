package org.bran.branproxy.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lizhle
 */
@Service
public class MailService {

    private static final String MAIL_FROM = "1121268624@qq.com";

    @Resource
    private JavaMailSender mailSender;

    public void sendMail(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(MAIL_FROM);
    }
}
