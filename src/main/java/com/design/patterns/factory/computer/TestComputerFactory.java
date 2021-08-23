package com.design.patterns.factory.computer;

public class TestComputerFactory {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.buildComputer(ComputerEnum.PERSONAL);
        System.out.println("Personal computer : "+pc);


        Computer server = ComputerFactory.buildComputer(ComputerEnum.SERVER);
        System.out.println("Server computer : "+server);

        System.out.println("server computer's HDD : "+server.getHDD());
        System.out.println("server computer's RAM : "+server.getRAM());
        System.out.println("server computer's CPU : "+server.getCPU());
        System.out.println("server computer's Name : "+server.getName());

    }
}
