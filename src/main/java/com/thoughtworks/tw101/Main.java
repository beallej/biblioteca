package com.thoughtworks.tw101;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by jbealle on 9/27/16.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Book book = new Book("Book title", "Book author", 1999);
        bookList.add(book);
        ArrayList<String> featureList = new ArrayList<>();
        featureList.add("F");
        PrintStream printStream = System.out;

        Library library = new Library(bookList, printStream);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Menu menu = new Menu(printStream, library, bufferedReader);
        Application application = new Application(printStream, new Library(bookList, printStream), menu);
        application.start();
    }
}
