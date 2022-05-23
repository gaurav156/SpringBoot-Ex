package com.springboot.ex.SpringBootEx.components;

import java.io.*;
import java.util.Properties;
import org.springframework.stereotype.Component;

@Component
public class PropertiesWriter {
    public void writeToProperties() {
        FileReader reader = null;
        FileWriter writer = null;

        File file = new File("src/main/resources/application.properties");

        try {
            reader = new FileReader(file);
            writer = new FileWriter(file);

            Properties p = new Properties();
            p.load(reader);

            p.setProperty("hostname","localhost");
            p.setProperty("username", "developer");
            p.store(writer,"");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}