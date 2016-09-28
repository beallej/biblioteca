package com.thoughtworks.tw101;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by jbealle on 9/28/16.
 */
public class Library {
    private final List<Book> bookList;
    private final PrintStream printStream;

    public Library(List<Book> bookList, PrintStream printStream) {

        this.bookList = bookList;
        this.printStream = printStream;
    }

    public void listBooks() {
        for (Book book : bookList) {
            printStream.println(book.toString());
        }
    }
}
