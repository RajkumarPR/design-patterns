package com.design.patterns.singleton;

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
        return "Bii Pugh singleton";
    }
}
