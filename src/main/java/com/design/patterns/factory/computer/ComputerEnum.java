package com.design.patterns.factory.computer;

public enum ComputerEnum {

    PERSONAL("Personal"),
    SERVER("server");

    private String name;

    ComputerEnum(String name) {
        this.name = name;
    }
}
