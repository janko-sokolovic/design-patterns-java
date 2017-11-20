package com.jasofalcon.designpatterns.creational.abstractfactory;

public class VeggieBurger implements Burger {
    @Override
    public void eatBurger() {
        System.out.println("I'm vegan. Did you know I'm vegan?");
    }
}
