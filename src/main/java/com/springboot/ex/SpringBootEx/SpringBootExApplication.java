package com.springboot.ex.SpringBootEx;

import com.springboot.ex.SpringBootEx.book.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringBootExApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootExApplication.class, args);

		List<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Science", "Cosmos", "Rushikesh"));
		bookList.add(new Book("Science", "The Origin of Species", "Rushikesh"));
		bookList.add(new Book("Engineering", "The Design of Everyday Things", "Gaurav"));
		bookList.add(new Book("Engineering", "Engineer to Win", "Ganesh"));
		bookList.add(new Book("Maths", "Vedic Mathematics", "Gaurav"));
		bookList.add(new Book("Maths", "Trigonometry", "Rushikesh"));
		bookList.add(new Book("Technology", "AI Superpowers", "Gaurav"));

		System.out.println();
//		Create a static method that returns all the books as a list collection

		System.out.println("1)\tList of all the books : ");

		printBooks(bookList);

		System.out.println();
//		Find all the books based on category filter value  e.g Science, Maths, Engineering, technology

		System.out.println("2)\tBooks based on category filter : ");

		System.out.println("\nScience books : ");
		bookList.stream().filter(p -> p.getBookCategory().equals("Science")).forEach(System.out::println);

		System.out.println("\nEngineering books : ");
		bookList.stream().filter(p -> p.getBookCategory().equals("Engineering")).forEach(System.out::println);

		System.out.println("\nMaths books : ");
		bookList.stream().filter(p -> p.getBookCategory().equals("Maths")).forEach(System.out::println);

		System.out.println("\nTechnology books : ");
		bookList.stream().filter(p -> p.getBookCategory().equals("Technology")).forEach(System.out::println);

		System.out.println();
//		Find all the books based on Author filter value e.g Rushikesh, Ganesh, Gaurav

		System.out.println("3)\tBooks based on Author filter : ");
		System.out.println("\nBooks of Rushikesh : ");
		bookList.stream().filter(p -> p.getBookAuthor().equals("Rushikesh")).forEach(System.out::println);

		System.out.println("\nBooks of Ganesh : ");
		bookList.stream().filter(p -> p.getBookAuthor().equals("Ganesh")).forEach(System.out::println);

		System.out.println("\nBooks of Gaurav : ");
		bookList.stream().filter(p -> p.getBookAuthor().equals("Gaurav")).forEach(System.out::println);

		System.out.println();
//		Find count of all the books based on Category (hint using lambda and grouping)

//		long countScience = bookList.stream().filter(p -> p.getBookCategory().equals("Science")).count();
//		long countEngineering = bookList.stream().filter(p -> p.getBookCategory().equals("Engineering")).count();
//		long countMaths = bookList.stream().filter(p -> p.getBookCategory().equals("Maths")).count();
//		long countTechnology = bookList.stream().filter(p -> p.getBookCategory().equals("Technology")).count();
//		System.out.println("\n4)\tCount of all the books based on Category :\n" +
//				"Science \t\t:\t " + countScience + "\n" +
//				"Engineering \t:\t " + countEngineering + "\n" +
//				"Maths \t\t\t:\t " + countMaths + "\n" +
//				"Technology \t\t:\t " + countTechnology);

		System.out.println("4)\tCount of all the books based on Category : ");
//		Map<String, List<Book>> map = bookList.stream().collect(Collectors.groupingBy(Book::getBookCategory));
		Map<String, Long> countBooks = bookList.stream().map(p -> p.getBookCategory()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(countBooks);
		countBooks.forEach((category, count) -> System.out.println(category +" : " +count));

//		forEach(new Consumer<Book>() {
//			@Override
//			public void accept(Book x) {
//				System.out.println(x);
//			}
//		})
	}

	public static void printBooks(List<Book> list){
		list.forEach(System.out::println);
	}

}
