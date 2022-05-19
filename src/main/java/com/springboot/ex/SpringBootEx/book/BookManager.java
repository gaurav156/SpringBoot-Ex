package com.springboot.ex.SpringBootEx.book;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class BookManager {
    private static final List<Book> bookList = new ArrayList<>();

    public BookManager()
    {
        bookList.add( new Book("Science", "Cosmos", "Rushikesh"));
        bookList.add( new Book("Science", "The Origin of Species", "Rushikesh"));
        bookList.add( new Book("Engineering", "The Design of Everyday Things", "Gaurav"));
        bookList.add( new Book("Engineering", "Engineer to Win", "Ganesh"));
        bookList.add( new Book("Maths", "Vedic Mathematics", "Gaurav"));
        bookList.add( new Book("Maths", "Trigonometry", "Rushikesh"));
        bookList.add( new Book("Technology", "AI Superpowers", "Gaurav"));
    }

    public static void printBooks(List<Book> list){
        list.forEach(x -> System.out.println("\t"+x));
    }
    public static void printCount(Map<String, Long> countList){
        countList.forEach((category, count) -> System.out.println("\t"+category+" : "+count));
    }

    //		Create a static method that returns all the books as a list collection
    public static List<Book> getList()
    {
        return Collections.unmodifiableList(bookList);
    }


    //		Find all the books based on category filter value  e.g Science, Maths, Engineering, technology

    public static List<Book> categoryFilter(String category){
        return getList().stream().filter(p -> p.getBookCategory().equals(category)).collect(Collectors.toList());
    }


    //		Find all the books based on Author filter value e.g Rushikesh, Ganesh, Gaurav

    public static List<Book> authorFilter(String author){
        return getList().stream().filter(p -> p.getBookAuthor().equals(author)).collect(Collectors.toList());
    }


    //		Find count of all the books based on Category (hint using lambda and grouping)

    public static Map<String, Long> categoryWiseCount(){
        return getList().stream().map(p -> p.getBookCategory()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }


    //    Calling Dynamic function

    public static void dynamicCalling(){
        Scanner s = new Scanner(System.in);

//        Print All :
        printBooks(getList());

//        For Category :
        System.out.println("Enter a Category : " );
        String category = s.nextLine();

        if(getList().stream().anyMatch(p -> p.getBookCategory().equals(category))){
            printBooks(categoryFilter(category));
        }
        else {
            System.out.println("Enter a valid Category");
        }

//        For Author :
        System.out.println("Enter an Author : " );
        String author = s.nextLine();

        if(getList().stream().anyMatch(p -> p.getBookAuthor().equals(author))){
            printBooks(authorFilter(author));
        }
        else {
            System.out.println("Enter a valid Author");
        }

//        For Count :
        printCount(categoryWiseCount());
    }


}
