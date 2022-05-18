package com.springboot.ex.SpringBootEx.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookManager {
    private static final List<Book> bookList = new ArrayList<>();

    public BookManager()
    {
        bookList.add( new Book("Science", "Cosmos", "Rushikesh"));
        bookList.add( new Book("Science", "Cosmos", "Rushikesh"));
        bookList.add( new Book("Science", "The Origin of Species", "Rushikesh"));
        bookList.add( new Book("Engineering", "The Design of Everyday Things", "Gaurav"));
        bookList.add( new Book("Engineering", "Engineer to Win", "Ganesh"));
        bookList.add( new Book("Maths", "Vedic Mathematics", "Gaurav"));
        bookList.add( new Book("Maths", "Trigonometry", "Rushikesh"));
        bookList.add( new Book("Technology", "AI Superpowers", "Gaurav"));
    }

    public static List<Book> getList()
    {
        return Collections.unmodifiableList(bookList);
    }
}
