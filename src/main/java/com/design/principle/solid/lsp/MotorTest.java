package com.design.principle.solid.lsp;

public class MotorTest {

    public static void main(String[] args) {

        Car car = new MotorCar(new Engine());

        System.out.println("This car is type");
        car.turnOnEngine();
        car.accelerate();


    }
}
