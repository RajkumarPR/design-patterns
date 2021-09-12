package com.design.patterns.creational.abstractfactory;

import com.design.patterns.creational.abstractfactory.animal.AnimalFactory;
import com.design.patterns.creational.abstractfactory.color.ColorFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {
        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Color".equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else
            throw new IllegalArgumentException("Did not find any factory with "+choice+" choice");
    }
}
