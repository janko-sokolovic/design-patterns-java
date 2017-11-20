package com.jasofalcon.designpatterns.behavioral.template;

public abstract class Dinner {
    abstract void prepare();

    abstract void cook();

    abstract void serve();

    public void makeDinner() {
        prepare();
        cook();
        serve();
    }
}
