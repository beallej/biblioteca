package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;


import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jbealle on 9/27/16.
 */
public class ApplicationTest {

    Application application;
    PrintStream printStream;
    ArrayList<Book> bookList;
    private Book book;

    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        bookList = new ArrayList<>();
        application = new Application(printStream, bookList);

        book = mock(Book.class);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnApplicationStart() throws Exception {
        application.start();

        verify(printStream).println("Welcome");

    }

    @Test
    public void shouldPrintOneBookAfterWelcomeMessage(){
        bookList.add(book);
        when(book.toString()).thenReturn("Book1");
        application.start();
        verify(printStream).println("Book1");
    }

    @Test
    public void shouldPrintTwoBooksAfterWelcomeMessage(){
        bookList.add(book);
        Book book2 = mock(Book.class);
        bookList.add(book2);
        when(book.toString()).thenReturn("Book2");
        application.start();
        verify(printStream).println("Book2");
    }

    @Test
    public void shouldDisplayBookDetailsWhenPrintingBook(){
        Book book = mock(Book.class);
        when(book.toString()).thenReturn("Test");

        bookList.add(book);
        application.start();
        //assertThat(printStream, both(containsString(bookTitle)).and(containsString(bookAuthor)).and(containsString(Integer.toString(yearPublished))));
    }

}