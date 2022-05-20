package com.springboot.ex.SpringBootEx;

import com.springboot.ex.SpringBootEx.components.Menu;
import com.springboot.ex.SpringBootEx.components.Prop;
import com.springboot.ex.SpringBootEx.service.GetPropertiesUsingGetResource;
import com.springboot.ex.SpringBootEx.service.ReadProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SpringBootExApplication {

	public static void main(String[] args) throws IOException {

		SpringApplication.run(SpringBootExApplication.class, args);

		Menu menu = new Menu();
		menu.BookMenu();

//		ReadProperties rp = new ReadProperties();
//		rp.readPropertiesUsingResourceBundle();

	}
}
