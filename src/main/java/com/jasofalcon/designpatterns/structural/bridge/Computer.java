package com.jasofalcon.designpatterns.structural.bridge;

public abstract class Computer {

    OperatingSystem operatingSystem;

    Computer(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void turnOn();
}
