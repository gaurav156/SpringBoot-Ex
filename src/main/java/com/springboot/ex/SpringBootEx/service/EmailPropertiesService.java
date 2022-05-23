package com.springboot.ex.SpringBootEx.service;

import com.springboot.ex.SpringBootEx.email.usingannotation.ConfigEmail;
import com.springboot.ex.SpringBootEx.email.usingannotation.EmailConfiguration;
import com.springboot.ex.SpringBootEx.email.usingclass.ReadEmailProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

@Service
public class EmailPropertiesService {

    private final Map<String, String> emailPropsList = new HashMap<>();
    public EmailPropertiesService()  {
//        1) Using Annotation Method :

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmailConfiguration.class);
        ConfigEmail configEmail = applicationContext.getBean(ConfigEmail.class);

        emailPropsList.put("hostname", configEmail.getHostName());
        emailPropsList.put("port", configEmail.getPort());
        emailPropsList.put("username", configEmail.getUserName());
        emailPropsList.put("password", configEmail.getPassword());
        emailPropsList.put("smtp.auth", String.valueOf(configEmail.isSmtpAuth()));
        emailPropsList.put("smtp.starttls.enable", String.valueOf(configEmail.isSmtpStarttlsEnable()));
    }

    public EmailPropertiesService(int num) throws IOException {
//        Without Annotation - Using Properties Class getProperty() method :

        InputStream is = this.getClass().getClassLoader().getResourceAsStream("Application.properties");
//        FileInputStream fis = new FileInputStream("src/main/resources/Application.properties");
        Properties prop = new Properties();
        prop.load(is);

        emailPropsList.put("spring.mail.host", prop.getProperty("spring.mail.host"));
        emailPropsList.put("spring.mail.port", prop.getProperty("spring.mail.port"));
        emailPropsList.put("spring.mail.username", prop.getProperty("spring.mail.username"));
        emailPropsList.put("spring.mail.password", prop.getProperty("spring.mail.password"));
        emailPropsList.put("spring.mail.properties.mail.smtp.auth", String.valueOf(prop.getProperty("spring.mail.properties.mail.smtp.auth")));
        emailPropsList.put("spring.mail.properties.mail.smtp.starttls.enable", String.valueOf(prop.getProperty("spring.mail.properties.mail.smtp.starttls.enable")));
    }

    public EmailPropertiesService(int num, int num2) throws IOException {
//        Without Annotation - Using Resource Bundle Class getString() method :

        ResourceBundle rb = ResourceBundle.getBundle("Application");

        emailPropsList.put("spring.mail.host", rb.getString("spring.mail.host"));
        emailPropsList.put("spring.mail.port", rb.getString("spring.mail.port"));
        emailPropsList.put("spring.mail.username", rb.getString("spring.mail.username"));
        emailPropsList.put("spring.mail.password", rb.getString("spring.mail.password"));
        emailPropsList.put("spring.mail.properties.mail.smtp.auth", String.valueOf(rb.getString("spring.mail.properties.mail.smtp.auth")));
        emailPropsList.put("spring.mail.properties.mail.smtp.starttls.enable", String.valueOf(rb.getString("spring.mail.properties.mail.smtp.starttls.enable")));
    }


    public Map<String, String> emailProps(){
        return emailPropsList;
    }

    public void printEmailConfig(Map<String, String> configList){
        configList.forEach((p, v) -> System.out.println(p +" : "+v));
    }

    public Set<String> EmailProperties(){
        return emailPropsList.keySet();
    }
    public void printEmailProperties(Set<String> propsList){
        propsList.forEach(p -> System.out.println(p));
    }

    public String findEmailProps(String prop){
        String a;
        return emailPropsList.getOrDefault(prop,"not available");
    }
}
