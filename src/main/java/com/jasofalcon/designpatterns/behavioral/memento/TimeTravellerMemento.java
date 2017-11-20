package com.jasofalcon.designpatterns.behavioral.memento;

class TimeTravellerMemento {

    private String state;

    TimeTravellerMemento(String state) {
        this.state = state;
    }

    String getState() {
        return state;
    }
}
