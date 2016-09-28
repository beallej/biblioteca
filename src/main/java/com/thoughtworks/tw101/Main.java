package com.thoughtworks.tw101;

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
        Application application = new Application(System.out, bookList);
        application.start();
    }
}
