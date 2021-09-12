package com.design.patterns.creational.singleton;

/**
 * @author rajkumar
 * Driver class to test all singleton design pattern implementations.
 */
public class SingletonTest {

    public static void main(String[] args) {


        /**
         * Singleton Non Thread safety
         */
        System.out.println("*** Singleton Non Thread safety ***");
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                SingletonNonThreadSafety singletonNonThreadSafety = SingletonNonThreadSafety.getInstance();

                singletonNonThreadSafety.setString("Non Thread safety singleton " + i);
                System.out.println(singletonNonThreadSafety.getString());
                // System.out.println(singletonNonThreadSafety);
            }
        }).start();

        // Sleep for 1 second to have clear output.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception ex) {

        }

        /**
         * Singleton Static factory implementation
         */
        System.out.println("*** Singleton Static factory implementation ***");
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                SingletonStaticFactoryMethod singletonStaticFactoryMethod = SingletonStaticFactoryMethod.getInstance();


                System.out.println(singletonStaticFactoryMethod.testSingletonStaticFactory());
                // System.out.println(singletonNonThreadSafety);
            }
        }).start();

        // Sleep for 1 second to have clear output.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception ex) {

        }

        /**
         * singleton Bill Pugh
         */

        System.out.println("\n*** Bill Pugh singleton ***");
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                SingletonBillPugh billPugh = SingletonBillPugh.getInstance();
                System.out.println(billPugh.testMethod()+" "+i);
            }
        }).start();

        // Sleep for 1 second to have clear output.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception ex) {

        }

        System.out.println("\n*** Enum singleton ***");

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
                System.out.println(singletonEnum.testEnumSingleton()+" "+i);
            }
        }).start();

    }
}
