package com.jasofalcon.designpatterns.behavioral.state;

public class PissedOffState implements State {
    @Override
    public void onEnterState() {
        System.out.println("She: 'AAAAaargh!");
    }

    @Override
    public void observeState() {
        System.out.println("She will probably kill you. Better run!");
    }
}
