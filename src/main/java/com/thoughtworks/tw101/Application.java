package com.thoughtworks.tw101;

import java.io.PrintStream;

/**
 * Created by jbealle on 9/27/16.
 */
public class Application {
    private Library library;
    private Menu menu;
    PrintStream printStream;

    public Application(PrintStream printStream, Library library, Menu menu) {
        this.printStream = printStream;
        this.library = library;
        this.menu = menu;
    }

    public void start() {
        printStream.println("Welcome");
        menu.display();
        library.listBooks();
    }


}
