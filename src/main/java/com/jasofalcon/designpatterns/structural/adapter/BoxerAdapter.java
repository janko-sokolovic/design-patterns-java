package com.jasofalcon.designpatterns.structural.adapter;


public class BoxerAdapter implements KickBoxer {

    private Boxer boxer;

    public BoxerAdapter() {
        boxer = new Boxer();
    }

    @Override
    public void kickBox() {
        boxer.box();
    }
}
