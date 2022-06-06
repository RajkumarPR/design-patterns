package com.design.patterns.structural.bridge.shape;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle with color "+color.fill());
    }
}
