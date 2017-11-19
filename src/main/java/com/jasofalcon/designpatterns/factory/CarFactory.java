package com.jasofalcon.designpatterns.factory;

public class CarFactory {

    public static Car create(String type) {
        if ("electric".equals(type)) {
            return new Tesla();
        } else if ("ice".equals(type)) {
            return new Audi();
        }

        return null; // or raise error.
    }

}
