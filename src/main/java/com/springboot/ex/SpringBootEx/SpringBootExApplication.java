package com.springboot.ex.SpringBootEx;

import com.springboot.ex.SpringBootEx.email.EmailPropsMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringBootExApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(SpringBootExApplication.class, args);

//		BookMenu menu = new BookMenu();
//		menu.BookMenu();

		EmailPropsMenu emailPropsMenu = new EmailPropsMenu();
		emailPropsMenu.PropertiesMenu();

//		GetPropertiesUsingGetResource gp = new GetPropertiesUsingGetResource();
//        gp.readFile("src/main/resources/Application.properties");

	}
}
