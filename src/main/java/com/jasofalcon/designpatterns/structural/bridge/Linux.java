package com.jasofalcon.designpatterns.structural.bridge;

public class Linux implements OperatingSystem {
    @Override
    public void applyDrivers() {
        System.out.println("All drivers for Linux are set up.");
    }

    @Override
    public String toString() {
        return "Linux";
    }
}
