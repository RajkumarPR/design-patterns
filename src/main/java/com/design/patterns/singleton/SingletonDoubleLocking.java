package com.design.patterns.singleton;

public class SingletonDoubleLocking {

    private static SingletonDoubleLocking doubleLocking;

    private SingletonDoubleLocking() {

    }

    public static SingletonDoubleLocking getInstance() {

        if (doubleLocking == null) {
            synchronized (SingletonDoubleLocking.class) {
                if (doubleLocking == null)
                    doubleLocking = new SingletonDoubleLocking();
            }
        }
        return doubleLocking;
    }

    public String helloSingleton() {
        return "Hello Singleton double locking";
    }
}
