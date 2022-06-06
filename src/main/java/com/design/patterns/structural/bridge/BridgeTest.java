package com.design.patterns.structural.bridge;

import com.design.patterns.structural.bridge.car.Assemble;
import com.design.patterns.structural.bridge.car.Bike;
import com.design.patterns.structural.bridge.car.Car;
import com.design.patterns.structural.bridge.car.Produce;
import com.design.patterns.structural.bridge.car.Vehicle;
import com.design.patterns.structural.bridge.shape.BlackColor;
import com.design.patterns.structural.bridge.shape.Shape;
import com.design.patterns.structural.bridge.shape.Triangle;

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
