package com.design.patterns.structural.bridge.car;

import com.design.patterns.structural.bridge.car.Workshop;

public class Produce implements Workshop {
    @Override
    public String work() {
        return "Produced";
    }
}
