package org.bran.branproxy.service;

import org.bran.branproxy.BranproxyApplicationTests;
import org.junit.Test;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class MailServiceTest extends BranproxyApplicationTests {

    @Resource
    private JavaMailSender mailSender;

    @Test
    public void testMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1121268624@qq.com");
        message.setTo("1031680234@qq.com");
        message.setSubject("test");
        message.setText("test mail");
        mailSender.send(message);
    }

}