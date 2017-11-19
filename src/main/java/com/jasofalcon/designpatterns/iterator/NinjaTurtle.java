package com.jasofalcon.designpatterns.iterator;

public class NinjaTurtle {
    private String name;
    private String color;
    private String weapon;

    NinjaTurtle(String name, String color, String weapon) {
        this.name = name;
        this.color = color;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getWeapon() {
        return weapon;
    }
}
