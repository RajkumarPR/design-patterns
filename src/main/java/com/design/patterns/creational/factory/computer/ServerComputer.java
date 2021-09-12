package com.design.patterns.creational.factory.computer;

public class ServerComputer extends Computer {

    private String hdd;
    private String ram;
    private String cpu;
    private String name;

    public ServerComputer(String hdd, String ram, String cpu, String name) {
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
        this.name = name;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
