package com.jasofalcon.designpatterns.structural.decorator;

public abstract class BirdDecorator implements Bird {
    private Bird bird;

    BirdDecorator(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void fly() {
        bird.fly();
    }
}
