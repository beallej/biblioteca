package com.thoughtworks.tw101;

/**
 * Created by jbealle on 9/28/16.
 */
public class Book {
    private final String bookTitle;
    private final String bookAuthor;
    private final int yearPublished;

    public Book(String bookTitle, String bookAuthor, int yearPublished) {

        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearPublished = yearPublished;
    }
}
