package com.jasofalcon.designpatterns.creational.abstractfactory;

public class BeefBurger implements Burger {
    @Override
    public void eatBurger() {
        System.out.println("Delicious beef!");
    }
}
