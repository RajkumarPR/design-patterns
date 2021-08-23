package com.design.patterns.abstractfactory.animal;

import com.design.patterns.abstractfactory.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(type)) {
            return new Duck();
        } else if ("Bear".equalsIgnoreCase(type)) {
            return new Bear();
        }
        return null;
    }
}
