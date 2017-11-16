package com.jasofalcon.designpatterns.factory;

public abstract class Car {

    abstract String getBrand();
    abstract String getModel();
    abstract int getHorsePower();

    @Override
    public String toString() {
        return "Car brand: " + getBrand() + ", model: " + getModel() + ", HP: " + getHorsePower();
    }
}
