package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by jbealle on 9/28/16.
 */
public class BookTest {

    Book book;
    int yearPublished;
    String bookAuthor;
    private String bookTitle;

    @Before
    public void setUp(){
        bookTitle = "Book Title";
        bookAuthor = "Book Author";
        yearPublished = 1999;
        book = new Book(bookTitle, bookAuthor, yearPublished);
    }

    @Test
    public void shouldReturnBookDetailsWhenCallingToString(){
        assertEquals(bookTitle + " | " + bookAuthor + " | " + Integer.toString(yearPublished), book.toString());
    }

}