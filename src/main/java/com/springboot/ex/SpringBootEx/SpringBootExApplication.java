package com.springboot.ex.SpringBootEx;

import com.springboot.ex.SpringBootEx.book.Book;
import com.springboot.ex.SpringBootEx.book.BookManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringBootExApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootExApplication.class, args);

//		System.out.println();
//		printBooks(BookManager.categoryFilter("Science"));
//		printBooks(BookManager.authorFilter("Gaurav"));
//		printCount(BookManager.categoryWiseCount());

//		Scanner sc = new Scanner(System.in);
////		Find all the books based on category filter value  e.g Science, Maths,  Engineering, technology
//		System.out.println("Enter a category to filter : ");
//		printBooks(BookManager.categoryFilter(sc.nextLine()));

		BookManager.dynamicCalling();

	}

}
