package com.design.patterns;

public class SingletonNonThreadSafety {

    // step 1 :  Create private static class reference variable.
    private static SingletonNonThreadSafety singletonNonThreadSafety = null;
    private String string;

    // step 2 : Declare private constructor so that no other can instantiate it.
    private SingletonNonThreadSafety() {

    }

    // step 3 : Define an public static method responsible for creating object singleton if not object was not instantiated.
    public static SingletonNonThreadSafety getInstance() {

        if (singletonNonThreadSafety == null) {
            singletonNonThreadSafety = new SingletonNonThreadSafety();
        }
        return singletonNonThreadSafety;
    }

    public String getString() {
        return string;
    }

    public void setString(String str) {
        this.string = str;
    }
}
