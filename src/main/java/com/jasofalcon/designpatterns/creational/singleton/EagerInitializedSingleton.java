package com.jasofalcon.designpatterns.creational.singleton;

public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public EagerInitializedSingleton getInstance() {
        return instance;
    }
}
