package com.design.patterns.structural.adapter;

public class McLarenGT implements Movable {

    /**
     * Get the speed of movable object in KMP
     *
     * @return the speed in KMP (Miles per hour)
     */
    @Override
    public double getSpeed() {
        return 350.9;
    }
}
