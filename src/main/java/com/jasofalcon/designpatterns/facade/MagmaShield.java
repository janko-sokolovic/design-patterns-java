package com.jasofalcon.designpatterns.facade;

class MagmaShield implements Shield {
    @Override
    public void shieldUp() {
        System.out.println("*Shield Up*");
    }
}
