package com.design.patterns.structural.bridge;

public class Produce implements Workshop{
    @Override
    public String work() {
        return "Produced";
    }
}
