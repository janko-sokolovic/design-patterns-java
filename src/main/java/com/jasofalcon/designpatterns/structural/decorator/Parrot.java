package com.jasofalcon.designpatterns.structural.decorator;

public class Parrot implements Bird {

    @Override
    public void fly() {
        System.out.println("I can fly!!");
    }
}
