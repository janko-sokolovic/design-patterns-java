package com.jasofalcon.designpatterns.singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public EagerInitializedSingleton getInstance() {
        return instance;
    }
}
