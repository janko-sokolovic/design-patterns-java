package com.jasofalcon.designpatterns.factory;

public class Audi extends Car {

    @Override
    String getBrand() {
        return "Audi";
    }

    @Override
    String getModel() {
        return "A4";
    }

    @Override
    int getHorsePower() {
        return 252;
    }
}
