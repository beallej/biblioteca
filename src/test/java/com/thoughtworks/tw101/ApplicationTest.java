package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


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
    private Library library;
    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        bookList = new ArrayList<>();
        library = mock(Library.class);
        book = mock(Book.class);
        application = new Application(printStream, bookList, library);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnApplicationStart() throws Exception {
        application.start();

        verify(printStream).println("Welcome");

    }

    @Test
    public void shouldIncludeListBooksWhenDisplayingFeatureList(){
        application.start();
        verify(printStream).println("1: List Books");
    }

    @Test
    public void shouldDisplayBooksWhenSelectingOptionListBooks() throws Exception {
        bookList.add(book);
        when(book.toString()).thenReturn("Book");
        BufferedReader bufferedReader = mock(BufferedReader.class);
        when(bufferedReader.readLine()).thenReturn("1");

        application.start();

        verify(library).listBooks();
    }
}