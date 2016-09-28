package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by jbealle on 9/28/16.
 */
public class MenuTest {

    private PrintStream printStream;
    private Menu menu;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        menu = new Menu(printStream);

    }

    @Test
    public void shouldDisplayListBooksOnStart() throws Exception {
        menu.display();
        verify(printStream).println("1: List Books");
    }

    @Test
    public void shouldAskUserToPickOptionOnStart() throws Exception {
        menu.display();
        verify(printStream).println("Please enter the number of the action you would like to perform");
    }
}