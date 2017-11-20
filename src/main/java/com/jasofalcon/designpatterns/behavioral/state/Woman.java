package com.jasofalcon.designpatterns.behavioral.state;

public class Woman {

    private State state;

    public Woman() {
    }

    public Woman(State state) {
        this.state = state;
    }

    public void buyHerCookies() {
        changeStateTo(new PeacefulState());
    }

    public void pmsComing() {
        changeStateTo(new PissedOffState());
    }

    private void changeStateTo(State state) {
        this.state = state;
        this.state.onEnterState();
    }

    public void observeState() {
        state.observeState();
    }
}
