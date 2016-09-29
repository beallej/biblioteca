package com.thoughtworks.tw101;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by jbealle on 9/29/16.
 */
public class InputTest {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private Input input;


    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        input = new Input(printStream, bufferedReader);

    }

    @Test
    public void shouldGetInputWhenUserEntersValidOption() throws Exception {
        when(bufferedReader.readLine()).thenReturn("1");
        assertEquals(input.getInput(), "1");
    }
}
