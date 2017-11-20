package com.jasofalcon.designpatterns.creational.singleton;

/**
 * Thread-safe singleton.
 * Better performance might be achieved with synchronized block.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (null == instance) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
