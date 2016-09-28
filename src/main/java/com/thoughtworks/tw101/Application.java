package com.thoughtworks.tw101;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by jbealle on 9/27/16.
 */
public class Application {
    private ArrayList<Book> bookList;
    private Library library;
    PrintStream printStream;

    public Application(PrintStream printStream, ArrayList<Book> bookList, Library library) {
        this.printStream = printStream;
        this.bookList = bookList;
        this.library = library;
    }

    public void start() {
        printStream.println("Welcome");
        printStream.println("1: List Books");
        library.listBooks();
    }


}
