package com.design.patterns.creational.abstractfactory.animal;

public class Dog implements Animal {

    @Override
    public String getType() {
        return "Dog is an social animal";
    }

    @Override
    public String makeSound() {
        return "Dog barks";
    }
}
