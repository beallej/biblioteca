package com.thoughtworks.tw101;

import java.io.PrintStream;

/**
 * Created by jbealle on 9/27/16.
 */
public class Application {
    PrintStream printStream;

    public Application(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void start() {
        printStream.println("Welcome");
    }
}
