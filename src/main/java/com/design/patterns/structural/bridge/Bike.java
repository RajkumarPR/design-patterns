package com.design.patterns.structural.bridge;

public class Bike extends Vehicle {

    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    protected void manufacture() {
        System.out.println("The bike's part are "+workshop1.work()+" then "+workshop2.work());
    }
}
