package com.design.patterns.abstractfactory;

import com.design.patterns.abstractfactory.animal.AnimalFactory;
import com.design.patterns.abstractfactory.color.ColorFactory;

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
