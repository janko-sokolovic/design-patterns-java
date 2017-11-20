package com.jasofalcon.designpatterns.structural.proxy;

public class AltarOfElders implements AltarOfHeroes {

    @Override
    public ElfHero createHero(String name) {
        System.out.println("Creating new hero: " + name);
        return new ElfHero(name);
    }
}
