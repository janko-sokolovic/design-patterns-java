package com.jasofalcon.designpatterns.template;

public class SpagettiDinner extends Dinner {
    @Override
    void prepare() {
        System.out.println("Preparing pasta, meatballs, tomatto sauce..");
    }

    @Override
    void cook() {
        System.out.println("Boiling pasta while sauce is frying..");
    }

    @Override
    void serve() {
        System.out.println("Mixing pasta with sauce..");
    }
}
