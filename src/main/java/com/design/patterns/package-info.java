package com.design.patterns;

/**
 * About Singleton patterns
 * ========================
 * A singleton class ensures that only one instance of that class is created.
 * To ensure the point of access, the class controls the instantiation of its object.
 * Singleton classes are found in many places in the JDK, such as java.lang.Runtime.
 * <p>
 * Implementation
 * =================
 * To implement a Singleton pattern, we have different approaches — but all of them have the following common concepts.
 * <p>
 *      1. Private constructor to prevent instantiation of the class from other classes.
 *      2. Private static variable of the same class that is the only instance of the class.
 *      3. Public static method that returns the instance of the class. This is the global access point for the outside world to get the instance of the singleton class.
 *
 *
 *  Different Approaches
 *  =====================
 *
 *     Eager initialization: instance of a class is created long before it is actually required
 *     Lazy initialization: instance of a class is created when the client sends a request
 *     Static block initialization: is similar to eager initialization, except that the instance of the class is created in the static block that provides the option for exception handling
 *     Thread safe singleton: is to make the global access method is synchronized so that only one thread can execute this method at a time
 *     Bill Pugh singleton: implementation using the static inner helper class. Static inner classes are not loaded into memory until their getInstance() methods are called
 *     Enum singleton: provides implicit support for thread safety and only one instance is guaranteed
 *
 * Eager initialization and lazy initialization work fine in a single-threaded environment. However, they won't be suitable for multi-threaded environments.
 *
 * Static block initialization has one drawback: If we have a class with three static fields and the application needs to access only one, for which instance creation is not required at all, we still have one instance created — whether we require it or not.
 *
 * A thread safe singleton works fine in multi-threaded environments but reduces performance because of the cost associated with the synchronized method.
 *
 * To overcome the issue of synchronization, Bill Pugh came up with his implementation using the static inner helper class. The static inner class is not loaded into memory until its getInstance() method is called.
 *
 * Meanwhile, Enum singletons provide implicit support for thread safety and only one instance is guaranteed, as per the Javadocs.
 *
 * Bill Pugh Singleton
 * ====================
 * A Bill Pugh Singleton is based on the “initialization on demand holder” idiom.
 * This idiom uses inner classes and does not use any synchronization construct.
 * It uses static blocks, but in a different way — and suggests using static inner classes.
 */