package com.design.patterns.creational.prototype;

import java.util.StringJoiner;

public abstract class Tree {
    private double mass;
    private double height;
    private Position position;

    // abstract method
    public abstract Tree copy();

    public Tree(double mass, double height) {
        this.mass = mass;
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Tree.class.getSimpleName() + "[", "]")
                .add("mass=" + mass)
                .add("height=" + height)
                .add("position=" + position)
                .toString();
    }

}
