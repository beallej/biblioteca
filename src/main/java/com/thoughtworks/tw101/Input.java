package com.thoughtworks.tw101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by jbealle on 9/29/16.
 */
public class Input {


    private final PrintStream printStream;
    private final BufferedReader bufferedReader;

    public Input(PrintStream printStream, BufferedReader bufferedReader) {

        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public String getInput() {
        String choice = null;
        while (choice == null) {
            try {
                choice = bufferedReader.readLine();
                if (choice.equals("1")) {
                    return choice;
                } else {
                    printStream.println("Select a valid option!");
                    choice = null;
                }

            } catch (IOException e) {
                choice = null;
            }
        }
        return choice;
    }
}
