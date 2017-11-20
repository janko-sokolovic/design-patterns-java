package com.jasofalcon.designpatterns.structural.proxy;

public class AltarOfEldersProxy implements AltarOfHeroes {

    private int heroCount;
    private static final int NUMBER_OF_HEROES_ALLOWED = 3;

    private AltarOfHeroes altar;

    public AltarOfEldersProxy(AltarOfHeroes altar) {
        this.altar = altar;
    }

    @Override
    public ElfHero createHero(String name) {
        if (heroCount < NUMBER_OF_HEROES_ALLOWED) {
            heroCount++;
            return altar.createHero(name);
        }
        System.out.println("No more heroes allowed!");
        return null;
    }
}
