package com.design.patterns.creational.singleton;

/**
 * Since Singleton instance is static and final variable it initialized when class is first loaded into memory
 * so creation of instance is inherently thread-safe.
 */
public class SingletonStaticFactoryMethod {

    private static final SingletonStaticFactoryMethod INSTANCE = new SingletonStaticFactoryMethod();

    private SingletonStaticFactoryMethod() {

    }

    public static SingletonStaticFactoryMethod getInstance() {
        return INSTANCE;
    }

    public String testSingletonStaticFactory() {
        return "Hello from static factory Singleton implementation";
    }
}
