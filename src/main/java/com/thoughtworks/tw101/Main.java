package com.thoughtworks.tw101;

import java.io.PrintStream;

/**
 * Created by jbealle on 9/27/16.
 */
public class Main {

    public static void main(String[] args) {
        Application application = new Application(System.out);
        application.start();
    }
}
