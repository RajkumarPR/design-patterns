package com.design.patterns.creational.singleton;

public class SingletonBillPugh {

    private SingletonBillPugh() {

    }

    private static class SingletonHolder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public String testMethod() {
        return "Bill Pugh singleton";
    }
}
