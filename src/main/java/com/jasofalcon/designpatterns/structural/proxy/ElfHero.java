package com.jasofalcon.designpatterns.structural.proxy;

public class ElfHero {

    private final String name;

    ElfHero(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
