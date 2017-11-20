package com.jasofalcon.designpatterns.behavioral.template;

public class PizzaDinner extends Dinner {
    @Override
    void prepare() {
        System.out.println("Preparing dough, mushrooms, cheese, pepperoni..");
    }

    @Override
    void cook() {
        System.out.println("Baking pizza..");
    }

    @Override
    void serve() {
        System.out.println("Cutting slices..");
    }
}
