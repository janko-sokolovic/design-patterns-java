package com.jasofalcon.designpatterns.creational.factory;

class Audi extends Car {

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
