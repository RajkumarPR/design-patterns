package com.design.patterns.factory;

public class Line implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a line");
    }
}
