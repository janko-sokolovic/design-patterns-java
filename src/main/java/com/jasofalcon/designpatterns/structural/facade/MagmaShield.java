package com.jasofalcon.designpatterns.structural.facade;

class MagmaShield implements Shield {
    @Override
    public void shieldUp() {
        System.out.println("*Shield Up*");
    }
}
