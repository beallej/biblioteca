package com.thoughtworks.tw101;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by jbealle on 9/27/16.
 */
public class Application {
    private ArrayList<String> bookList;
    PrintStream printStream;

    public Application(PrintStream printStream, ArrayList<String> bookList) {

        this.printStream = printStream;
        this.bookList = bookList;
    }

    public void start() {
        printStream.println("Welcome");

        for(String book : bookList){
            printStream.println(book);
        }
    }
}
