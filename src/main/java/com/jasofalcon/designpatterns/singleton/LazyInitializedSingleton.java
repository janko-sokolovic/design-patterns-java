package com.jasofalcon.designpatterns.singleton;

/**
 * Lazy loaded.
 * Not thread safe.
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private String name;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (null == instance) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
