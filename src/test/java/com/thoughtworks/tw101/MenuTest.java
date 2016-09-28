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
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void shouldDisplayListBooksOnStart() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        Menu menu = new Menu(printStream);
        menu.display();
        verify(printStream).println("1: List Books");
    }

}