package com.design.patterns.structural.bridge;

public class Assemble  implements Workshop {

    @Override
    public String work() {
        return "Assembled";
    }
}
