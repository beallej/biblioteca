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
    private BufferedReader bufferedReader;

    public Menu(PrintStream printStream, Library library, BufferedReader bufferedReader) {

        this.printStream = printStream;
        this.library = library;

        this.bufferedReader = bufferedReader;
    }

    public void display() {
        printStream.println("1: List Books");
        printStream.println("Please enter the number of the action you would like to perform");

        String choice = getInput();
        library.listBooks();



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
                printStream.println("Bad input");
                choice = null;
            }
        }
        return choice;
    }
}
