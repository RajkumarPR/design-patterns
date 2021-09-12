package com.design.patterns.creational.abstractfactory.animal;

public class Bear implements Animal {

    @Override
    public String getType() {
        return "Dog is an wild animal";
    }

    @Override
    public String makeSound() {
        return "Ahowe";
    }
}
