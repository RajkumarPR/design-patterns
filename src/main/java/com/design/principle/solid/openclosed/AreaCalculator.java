package com.design.principle.solid.openclosed;

public class AreaCalculator {

    private Shape shape;

    public AreaCalculator(Shape shape) {
        this.shape = shape;
    }

    public double calculateArea() {
        return shape.calculateArea();
    }
}
