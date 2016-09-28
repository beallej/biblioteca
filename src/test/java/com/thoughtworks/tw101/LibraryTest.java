package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jbealle on 9/28/16.
 */
public class LibraryTest {

    private List<Book> bookList;
    private Book book;
    private Library library;
    private PrintStream printStream;

    @Before
    public void setUp() throws Exception {
        book = mock(Book.class);
        bookList = new ArrayList<>();
        printStream = mock(PrintStream.class);
        library = new Library(bookList, printStream);
    }

    @Test
    public void shouldPrintOneBookWhenListingOneBook(){
        bookList.add(book);
        when(book.toString()).thenReturn("Book1");
        library.listBooks();
        verify(printStream).println("Book1");
    }

    @Test
    public void shouldPrintTwoBookWhenListingTwoBooks(){
        bookList.add(book);
        Book book2 = mock(Book.class);
        bookList.add(book2);
        when(book2.toString()).thenReturn("Book2");

        library.listBooks();

        verify(printStream).println("Book2");
    }



}