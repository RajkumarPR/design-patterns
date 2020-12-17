package com.design.patterns.factory;


import java.util.Optional;

/**
 * @author rajkumar
 *
 */
public class TestFactoryPattern {

    public static void main(String[] args) {

        // Handle NullPointerException using optional.
        Optional<Shape> line = ShapeFactory.getShape(ShapeType.TRIANGLE);
        line.ifPresent(Shape::draw);


        Optional<Shape> circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        circle.ifPresent(Shape::draw);


        Optional<Shape> rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.ifPresent(Shape::draw);


        Optional<Shape> square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.ifPresent(Shape::draw);

    }
}
