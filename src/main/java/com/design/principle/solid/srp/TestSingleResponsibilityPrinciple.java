package com.design.principle.solid.srp;

public class TestSingleResponsibilityPrinciple {

    public static void main(String[] args) {

        Book book = new Book(
                "Understanding SOLID Design Principles",
                "Rajkumar",
                "In depth Understanding SOLID Design Principles");

        BookPrinter bookPrinter = new BookPrinter();

        // Call to print book to console
        bookPrinter.printTextToConsole(book.getText());

        // Call to print book to other medium
        bookPrinter.printTextToAnotherMedium(book.getText());

    }
}
