package com.thoughtworks.tw101;

import java.io.PrintStream;

/**
 * Created by jbealle on 9/28/16.
 */
public class Menu {
    private PrintStream printStream;

    public Menu(PrintStream printStream) {

        this.printStream = printStream;
    }

    public void display() {
        printStream.println("1: List Books");
    }
}
