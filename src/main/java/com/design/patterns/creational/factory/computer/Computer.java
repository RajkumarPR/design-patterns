package com.design.patterns.creational.factory.computer;

public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    public abstract String getName();

    @Override
    public String toString() {
        return "RAM = " + this.getRAM() +
                ", HDD = " + this.getHDD() +
                ", CPU = " + this.getCPU() +
                ", Name = " + this.getName();
    }
}
