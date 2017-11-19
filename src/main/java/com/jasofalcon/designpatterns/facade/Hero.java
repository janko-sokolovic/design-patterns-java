package com.jasofalcon.designpatterns.facade;

public class Hero {
    private Weapon sword;
    private Shield shield;

    public Hero() {
        this.sword = new CrystalSword();
        this.shield = new MagmaShield();
    }

    public void attack() {
        sword.prepare();
        shield.shieldUp();
        sword.strike();
        run();
        warCry();
    }

    private void run() {
        System.out.println("*Start running..*");
    }

    private void warCry() {
        System.out.println("For the king!");
    }


}
