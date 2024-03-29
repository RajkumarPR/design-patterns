package com.design.patterns.creational.abstractfactory.animal;

public class Duck implements Animal {

    @Override
    public String getType() {
        return "Duck is a bird";
    }

    @Override
    public String makeSound() {
        return "Quack quack";
    }
}
