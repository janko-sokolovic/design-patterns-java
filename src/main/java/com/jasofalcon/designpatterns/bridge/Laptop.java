package com.jasofalcon.designpatterns.bridge;

public class Laptop extends  Computer {

    public Laptop(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop running " + operatingSystem  + " is booting...");
    }
}
