package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by jbealle on 9/28/16.
 */
public class MenuTest {

    private PrintStream printStream;
    private Menu menu;
    private Library library;
    private Input input;

    @Before
    public void setUp() throws Exception {
        input = mock(Input.class);
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        menu = new Menu(printStream, library, input);

    }

    @Test
    public void shouldDisplayListBooksOnStart() throws Exception {
        when(input.getInput()).thenReturn("1");
        menu.display();
        verify(printStream).println("1: List Books");
    }

    @Test
    public void shouldAskUserToPickOptionOnStart() throws Exception {
        when(input.getInput()).thenReturn("1");
        menu.display();
        verify(printStream).println("Please enter the number of the action you would like to perform");
    }

    @Test
    public void shouldDisplayBooksWhenSelectingOptionListBooks() throws Exception {
        when(input.getInput()).thenReturn("1");
        menu.display();
        verify(library).listBooks();
    }
}