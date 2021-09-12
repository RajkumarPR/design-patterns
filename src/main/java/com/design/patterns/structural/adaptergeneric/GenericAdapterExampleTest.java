package com.design.patterns.structural.adaptergeneric;

public class GenericAdapterExampleTest {

    public static void main(String[] args) {

        ITarget adapter = new Adapter(new Adaptee());

        adapter.request();

    }
}
