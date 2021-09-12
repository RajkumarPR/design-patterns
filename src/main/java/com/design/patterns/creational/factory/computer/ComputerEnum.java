package com.design.patterns.creational.factory.computer;

public enum ComputerEnum {

    PERSONAL("Personal"),
    SERVER("server");

    private String name;

    ComputerEnum(String name) {
        this.name = name;
    }
}
