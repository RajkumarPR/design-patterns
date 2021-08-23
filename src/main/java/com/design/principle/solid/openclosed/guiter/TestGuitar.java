package com.design.principle.solid.openclosed.guiter;

public class TestGuitar {

    public static void main(String[] args) {
        Guitar guitar = new Guitar(
                "TestMaker",
                "G-100",
                100
        );

        System.out.println("Model : "+guitar.getModel());

        // Let's say user wants some cool colorflames then he can extend Guitar class add functionality

        SuperCoolGuitarWithFlames flames = new SuperCoolGuitarWithFlames(
                "TestMaker",
                "G-100",
                100,
                "Cool Blue"
        );

        System.out.println("Flame color : "+flames.getFlameColor());

    }
}
