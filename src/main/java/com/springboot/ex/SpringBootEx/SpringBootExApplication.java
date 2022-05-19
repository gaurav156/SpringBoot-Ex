package com.springboot.ex.SpringBootEx;

import com.springboot.ex.SpringBootEx.components.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootExApplication.class, args);

		Menu menu = new Menu();
		menu.BookMenu();

	}

}
