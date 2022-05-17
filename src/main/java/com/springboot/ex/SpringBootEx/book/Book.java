package com.springboot.ex.SpringBootEx.book;

public class Book {
    private String bookCategory;
    private String bookTtile;
    private String bookAuthor;

    public Book(String bookCategory, String bookTtile, String bookAuthor) {
        this.bookCategory = bookCategory;
        this.bookTtile = bookTtile;
        this.bookAuthor = bookAuthor;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public String getBookTtile() {
        return bookTtile;
    }

    public void setBookTtile(String bookTtile) {
        this.bookTtile = bookTtile;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookCategory='" + bookCategory + '\'' +
                ", bookTtile='" + bookTtile + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
