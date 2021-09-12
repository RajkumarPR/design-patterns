package com.design.patterns.creational.factory.shape;

import java.util.Optional;

public abstract class ShapeFactory {

    public static Optional<Shape> getShape(ShapeType shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case LINE:
                shape = new Line();
                break;
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            default:
                System.out.println("Could not find Geometry shape " + shapeType);
        }
        return Optional.ofNullable(shape);
    }
}
