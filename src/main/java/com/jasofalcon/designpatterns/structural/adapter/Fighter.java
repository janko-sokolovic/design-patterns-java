package com.jasofalcon.designpatterns.structural.adapter;

public class Fighter implements KickBoxer {
    private KickBoxer kickBoxer;

    public Fighter(KickBoxer kickBoxer) {
        this.kickBoxer = kickBoxer;
    }

    @Override
    public void kickBox() {
        kickBoxer.kickBox();
    }
}
