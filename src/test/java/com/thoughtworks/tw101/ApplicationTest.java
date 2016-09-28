package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by jbealle on 9/27/16.
 */
public class ApplicationTest {

    Application application;
    PrintStream printStream;
    ArrayList<String> bookList;
    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        bookList = new ArrayList<>();
        application = new Application(printStream, bookList);

    }

    @Test
    public void shouldDisplayWelcomeMessageOnApplicationStart() throws Exception {
        application.start();

        verify(printStream).println("Welcome");

    }

    @Test
    public void shouldPrintOneBookAfterWelcomeMessage(){
        bookList.add("Book1");
        application.start();

        verify(printStream).println("Book1");
    }

    @Test
    public void shouldPrintTwoBooksAfterWelcomeMessage(){
        bookList.add("Book2");
        application.start();

        verify(printStream).println("Book2");
    }

}