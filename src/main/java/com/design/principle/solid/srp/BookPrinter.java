package com.design.principle.solid.srp;

public class BookPrinter {

    // methods for outputting text
    void printTextToConsole(String text){
        //our code for formatting and printing the text
        System.out.println("Printing to console : "+text);
    }

    void printTextToAnotherMedium(String text){
        // code for writing to any other location..
        System.out.println("Printing to other medium : "+text);
    }
}
