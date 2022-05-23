package com.springboot.ex.SpringBootEx.email.usingclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ReadEmailProperties {
    public void EmailPropsUsingProperties() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/Application.properties");
        Properties prop = new Properties();
        prop.load(fis);

        System.out.println("Using Properties Class : \n");
        System.out.println("hostname : "+prop.getProperty("spring.mail.host"));
        System.out.println("port : "+prop.getProperty("spring.mail.port"));
        System.out.println("username : "+prop.getProperty("spring.mail.username"));
        System.out.println("password : "+prop.getProperty("spring.mail.password"));
        System.out.println("smtp.auth : " +prop.getProperty("spring.mail.properties.mail.smtp.auth"));
        System.out.println("smtp.starttls.enable : " +prop.getProperty("spring.mail.properties.mail.smtp.starttls.enable"));

    }

    public void EmailPropsUsingResourceBundle() throws IOException{
        ResourceBundle rb = ResourceBundle.getBundle("Application");

        System.out.println("\nUsing Resource Bundle : \n");
        System.out.println("hostname  : "+ rb.getString("spring.mail.host"));
        System.out.println("port : "+ rb.getString("spring.mail.port"));
        System.out.println("username : "+ rb.getString("spring.mail.username"));
        System.out.println("password : "+ rb.getString("spring.mail.password"));
        System.out.println("smtp.auth : "+ rb.getString("spring.mail.properties.mail.smtp.auth"));
        System.out.println("smtp.starttls.enable : "+ rb.getString("spring.mail.properties.mail.smtp.starttls.enable"));
    }
}
