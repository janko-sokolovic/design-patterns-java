package com.jasofalcon.designpatterns.structural.decorator;

public class AmazonParrot extends BirdDecorator {

    public AmazonParrot(Bird bird) {
        super(bird);
    }

    @Override
    public void fly() {
        super.fly();
        speakWhileFlying();
    }

    private void speakWhileFlying() {
        System.out.println("Oh my, I can talk too..");
    }
}
