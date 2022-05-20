package com.springboot.ex.SpringBootEx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfig {

    //    Methods 1 : Using @Vale Notation
    @Value("${app.name}")
    private String appName;

    @Value("${my.hostname}")
    private String hostName;

    @Value("${my.username}")
    private String userName;

    @Value("${my.password}")
    private String password;

    @RequestMapping("/config/app-name")
    public String getAppName(){
        return appName;
    }

    @RequestMapping("/config/hostname")
    public String getHostName(){
        return hostName;
    }

    //    Method 2 : Using @Autowired Notation to create object of Configuration class MySettings
    @Autowired
    private MySettings mySettings;

    @RequestMapping("/config/my-settings")
    public String getMySettings(){
        return "[ user name : "+mySettings.getUsername() +" ] [ "+ "password : "+mySettings.getPassword() +" ] ";
    }

    @RequestMapping("/config/my-settings/port")
    public String getMyPort(){
        return "port : "+mySettings.getPort();
    }
}

