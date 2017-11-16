package com.jasofalcon.designpatterns.decorator;

public abstract class BirdDecorator implements Bird{
    protected Bird bird;

    public BirdDecorator(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void fly() {
        bird.fly();
    }
}
