package com.design.patterns.structural.bridge;

public class BridgeTest {

    public static void main(String[] args) {

        Shape triangle = new Triangle(new BlackColor());
        triangle.draw();


        Vehicle car = new Car(new Produce(), new Assemble());
        car.manufacture();
        Vehicle bike = new Bike(new Produce(), new Assemble());
        bike.manufacture();
    }
}
