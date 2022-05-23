package com.springboot.ex.SpringBootEx.controller.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailConfig {

    //    Methods 1 : Using @Vale Notation
    @Value("${spring.mail.host}")
    private String hostName;

    @Value("${spring.mail.port}")
    private String port;

    @Value("${spring.mail.username}")
    private String userName;

    @Value("${spring.mail.password}")
    private String password;

    @Value("${spring.mail.properties.mail.smtp.auth}")
    private boolean smtpAuth;

    @Value("${spring.mail.properties.mail.smtp.starttls.enable}")
    private boolean smtpStarttlsEnable;

    @RequestMapping("/email-config")
    public String getEmailConfig(){
        return "hostname : "+hostName+" port :"+port+" username : "+userName+" password : "+password+" smtp.auth : "+smtpAuth+" smtp.starttls.enable : "+smtpStarttlsEnable;
    }

    @RequestMapping("/email-config/hostname")
    public String getHostName() {
        return hostName;
    }

    @RequestMapping("/email-config/port")
    public String getPort(){
        return port;
    }

    @RequestMapping("/email-config/username")
    public String getUserName(){
        return userName;
    }

    @RequestMapping("/email-config/smtp-auth")
    public boolean getSmtpAuth(){
        return smtpAuth;
    }

    //    Method 2 : Using @Autowired Notation to create object of Configuration class MySettings
    @Autowired
    private EmailSettings emailSettings;

    @RequestMapping("/email-config/my-settings")
    public String getMyEmailSettings() {
        return "[ user name : " + emailSettings.getUsername() + " ] [ " + "password : " + emailSettings.getPassword() + " ] ";
    }

    @RequestMapping("/email-config/my-settings/port")
    public String getMyPort() {
        return "port : " + emailSettings.getPort();
    }

    @RequestMapping("/email-config/my-settings/host")
    public String getMyHost() {
        return "host : " + emailSettings.getHost();
    }
}