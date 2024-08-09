package com.congquy.diamondshop.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendVerificationEmail(String recipientEmail, String verificationCode) {
        String subject = "Xác nhận email của bạn";
        String message = "Vui lòng nhập mã xác nhận sau đây để hoàn tất đăng ký: " + verificationCode;

        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientEmail);
        email.setSubject(subject);
        email.setText(message);

        mailSender.send(email);
    }
}
