package com.design.patterns.structural.adapter;

import java.text.DecimalFormat;

public class Client {

    public static void main(String[] args) {

        // Till no client looking for speed of the movable in KMPH
        Movable mcLarenGT = new McLarenGT();

        System.out.println("McLaren GT top speed in MPH: " + mcLarenGT.getSpeed());

        // Let's assume same movable object you want use in India and UK where
        // Kilometer per hour(KMPH) unit is used to measure speed

        // Note: why i passing "mclarenGT" object ot adapter is because i need
        // know speed of same in KMPH
        MovableSpeedAdapter adapter = new MovableSpeedAdapterImpl(mcLarenGT);
        System.out.println("McLaren GT top speed in KMPH : " + new DecimalFormat("#.00").format(adapter.getSpeed()));


        // example 2 : browser adapter
        System.out.println("\n Browser Adapter example ");
        BrowserDriver browserDriver = new ChromeBrowser();

        browserDriver.findElement();
        browserDriver.clickElement();

        // Internet explore does not support the browserDriver interface
        // so an adapter is written

        BrowserAdapter browserAdapter = new BrowserAdapter(new IEBrowser());
        browserAdapter.findElement();
        browserAdapter.clickElement();

    }
}
