package com.design.principle.solid.openclosed;

/**
 * @author rajkumar
 */
public class TestShapes {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(120.0, 60.0);
        AreaCalculator rectangleCalculator = new AreaCalculator(rectangle);
        System.out.println("Area of rectangle : " + rectangleCalculator.calculateArea());

        Shape circle = new Circle(20.0);
        AreaCalculator circleCalculator = new AreaCalculator(circle);
        System.out.println("Area of circle : " + circleCalculator.calculateArea());
    }
}
