package com.design.patterns.structural.bridge.car;

public class Assemble  implements Workshop {

    @Override
    public String work() {
        return "Assembled";
    }
}
