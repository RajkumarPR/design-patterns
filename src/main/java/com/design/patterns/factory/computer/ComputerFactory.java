package com.design.patterns.factory.computer;

public class ComputerFactory {

    public static Computer buildComputer(ComputerEnum computerEnum) {

        Computer computer;
        switch (computerEnum) {
            case PERSONAL:
                computer = new PersonalComputer(
                        "512GB",
                        "8GB",
                        "3.2Ghz",
                        "Macbook pro M1");
                break;
            case SERVER:
                computer = new ServerComputer(
                        "2TB",
                        "64GB",
                        "6.8Ghz",
                        "Intel xenon");
                break;
            default:
                throw new IllegalArgumentException(computerEnum.name() + " is not supported");
        }
        return computer;

    }
}
