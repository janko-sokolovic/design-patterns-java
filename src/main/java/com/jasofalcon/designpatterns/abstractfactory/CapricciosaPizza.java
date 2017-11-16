package com.jasofalcon.designpatterns.abstractfactory;

public class CapricciosaPizza implements Pizza {
    @Override
    public void eatPizza() {
        System.out.println("Standard but great!");
    }
}
