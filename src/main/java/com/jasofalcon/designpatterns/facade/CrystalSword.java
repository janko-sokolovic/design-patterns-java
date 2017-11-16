package com.jasofalcon.designpatterns.facade;

class CrystalSword implements Weapon {
    @Override
    public void prepare() {
        System.out.println("*Pulls sword out.*");
    }

    @Override
    public void strike() {
        System.out.println("*Swing!*");
    }
}
