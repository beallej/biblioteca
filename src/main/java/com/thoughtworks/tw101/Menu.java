package com.thoughtworks.tw101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by jbealle on 9/28/16.
 */
public class Menu {
    private PrintStream printStream;
    private Library library;
    private Input input;

    public Menu(PrintStream printStream, Library library, Input input) {

        this.printStream = printStream;
        this.library = library;

        this.input = input;
    }

    public void display() {
        printStream.println("1: List Books");
        printStream.println("Please enter the number of the action you would like to perform");

        String choice = input.getInput();
        library.listBooks();



    }

}
