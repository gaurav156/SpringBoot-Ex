package com.springboot.ex.SpringBootEx.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ReadProperties {
    public void readPropertiesUsingProperties() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/Application.properties");
        Properties prop = new Properties();
        prop.load(fis);

        System.out.println("Using Properties Class : \n");
        System.out.println("App Name : "+prop.getProperty("app.name"));
        System.out.println("hostname : "+prop.getProperty("my.hostname"));
        System.out.println("port : "+prop.getProperty("my.port"));
        System.out.println("username : "+prop.getProperty("my.username"));
        System.out.println("password : "+prop.getProperty("my.password"));

    }

    public void readPropertiesUsingResourceBundle() throws IOException{
        ResourceBundle rb = ResourceBundle.getBundle("Application");

        System.out.println("\nUsing Resource Bundle : \n");
        System.out.println("App Name : "+ rb.getString("app.name"));
        System.out.println("hostname : "+ rb.getString("my.hostname"));
        System.out.println("port : "+ rb.getString("my.port"));
        System.out.println("username : "+ rb.getString("my.username"));
        System.out.println("password : "+ rb.getString("my.password"));
    }
}