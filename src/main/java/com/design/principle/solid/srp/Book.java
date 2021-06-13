package com.design.principle.solid.srp;

/**
 * Single Responsibility Principle (SRP): This principle states that a "class should only have one responsibility.
 * Furthermore, it should only have one reason to change".
 *
 * @author rajkumar
 */
public class Book {

    private String name;
    private String author;
    private String text;

    public Book() {
    }

    public Book(String name, String author, String text) {
        this.name = name;
        this.author = author;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * methods that directly relate to the book properties
     */
    public String replaceWordInText(String word) {
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word) {
        return text.contains(word);
    }

    // now if we add an method to print the book content into console, but in future the printing may change,
    // below method is violating the Single Responsibility Principle
    // we need take out the printing functionality to an another class

   /* public void printTextToConsole() {
        System.out.println("Book content : "+text);
    } */
}
