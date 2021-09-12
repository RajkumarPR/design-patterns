package com.design.patterns.structural.adapter;

import com.design.patterns.structural.adapter.McLarenGT;
import com.design.patterns.structural.adapter.Movable;
import com.design.patterns.structural.adapter.MovableSpeedAdapter;
import com.design.patterns.structural.adapter.MovableSpeedAdapterImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovableSpeedClient {

    @Test
    public void existingMovableDefaultSpeedMeasurement(){

        Movable mcLarenGt = new McLarenGT();
        assertEquals(mcLarenGt.getSpeed(),350.9, 0.0);
    }

    @Test
    public void convertMPHSpeedMeasurementToKMPH() {

        MovableSpeedAdapter adapter = new MovableSpeedAdapterImpl(new McLarenGT());
        assertEquals(adapter.getSpeed(), 350.9 * 1.60934 , 0.001);
    }
}