package com.design.patterns.creational.prototype;

public class AppleTree extends Tree {

    private String type;

    public AppleTree(double mass, double height) {
        super(mass, height);
        this.type = "Apple";
    }

    @Override
    public Tree copy() {
        Tree appleTree = new AppleTree(this.getMass(), this.getHeight());
        appleTree.setPosition(this.getPosition());
        return appleTree;
    }
}
