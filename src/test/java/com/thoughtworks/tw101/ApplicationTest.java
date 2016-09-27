package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by jbealle on 9/27/16.
 */
public class ApplicationTest {

    Application application;
    PrintStream printStream;
    @Before
    public void setup(){
        printStream = mock(PrintStream.class);
        application = new Application(printStream);
    }

    @Test
    public void shouldDisplayWelcomeMessageOnApplicationStart() throws Exception {
        application.start();

        verify(printStream).println("Welcome");

    }
}