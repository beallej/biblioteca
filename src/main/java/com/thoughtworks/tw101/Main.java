package com.thoughtworks.tw101;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by jbealle on 9/27/16.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        Application application = new Application(System.out, bookList);
        application.start();
    }
}
