package com.design.patterns.structural.bridge;

public class Car extends Vehicle{

    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    protected void manufacture() {
        System.out.println("The Car's parts are "+workshop1.work()+" then "+workshop2.work());
    }
}
