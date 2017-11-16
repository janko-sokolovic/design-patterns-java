package com.jasofalcon.designpatterns.bridge;

public class Windows implements OperatingSystem {

    @Override
    public void applyDrivers() {
        System.out.println("All drivers for windows are set up.");
    }

    @Override
    public String toString() {
        return "Windows";
    }
}
