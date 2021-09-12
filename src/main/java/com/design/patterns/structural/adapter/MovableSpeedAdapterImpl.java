package com.design.patterns.structural.adapter;

public class MovableSpeedAdapterImpl implements MovableSpeedAdapter {

    private Movable movable;

    public MovableSpeedAdapterImpl(Movable movable) {
        this.movable = movable;
    }

    /**
     * Get the speed of movable object in KMP
     *
     * @return the speed in KMP (Miles per hour)
     */
    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(movable.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
