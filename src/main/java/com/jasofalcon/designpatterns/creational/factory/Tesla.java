package com.jasofalcon.designpatterns.creational.factory;

class Tesla extends Car {

    @Override
    String getBrand() {
        return "Tesla";
    }

    @Override
    String getModel() {
        return "Model S";
    }

    @Override
    int getHorsePower() {
        return 382;
    }
}
