package com.jasofalcon.designpatterns.behavioral.state;

public class PeacefulState implements State {
    @Override
    public void onEnterState() {
        System.out.println("She: 'MMmmmm...zzzzzz....:)'");
    }

    @Override
    public void observeState() {
        System.out.println("She loves you very much.");
    }
}
