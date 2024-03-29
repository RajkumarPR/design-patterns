package com.design.patterns.structural.bridge.shape;

public abstract class Shape {

    protected Color color; // bridge to implementor

    protected Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();

}
