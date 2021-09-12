package com.design.patterns.creational.prototype;

public class OrangeTree extends Tree {

    private String type;

    public OrangeTree(double mass, double height) {
        super(mass, height);
        this.type = "Orange";
    }

    @Override
    public Tree copy() {
        Tree orangeTree = new OrangeTree(this.getMass(), this.getHeight());
        orangeTree.setPosition(this.getPosition());
        return orangeTree;
    }
}
