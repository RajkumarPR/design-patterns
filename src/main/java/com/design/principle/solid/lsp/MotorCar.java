package com.design.principle.solid.lsp;

public class MotorCar implements Car {

    private Engine engine;

    public MotorCar() {
    }

    public MotorCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }
}

class ElectricCar implements Car {

   // private Engine engine;
    @Override
    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    @Override
    public void accelerate() {
        System.out.println("this acceleration is crazy!");

    }
}

interface Car {

    void turnOnEngine();
    void accelerate();

}

class Engine {

    public void on() {
        System.out.println("Engine is on");
    }

    public void powerOn(int power) {
        System.out.println("Engine accelerated to : "+power);
    }
}

