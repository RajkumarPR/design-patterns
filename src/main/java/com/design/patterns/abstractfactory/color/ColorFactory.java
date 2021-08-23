package com.design.patterns.abstractfactory.color;

import com.design.patterns.abstractfactory.AbstractFactory;

public class ColorFactory implements AbstractFactory<IColor> {

    @Override
    public IColor create(String type) {
        if ("Red".equalsIgnoreCase(type)) {
            return new Red();
        } else if ("white".equalsIgnoreCase(type)) {
            return new White();
        } else if ("Black".equalsIgnoreCase(type)) {
            return new Black();
        } else
            throw new IllegalArgumentException("No object for your choice : "+type);
    }
}
