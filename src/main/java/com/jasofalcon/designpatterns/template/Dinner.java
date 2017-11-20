package com.jasofalcon.designpatterns.template;

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
