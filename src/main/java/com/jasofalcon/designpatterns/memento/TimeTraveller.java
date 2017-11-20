package com.jasofalcon.designpatterns.memento;

public class TimeTraveller {

    private String currentState;

    public TimeTraveller(String state) {
        currentState = state;
    }

    public void timePasses(String currentState) {
        this.currentState = currentState;
    }

    public String getCurrentState() {
        return currentState;
    }

    public TimeTravellerMemento saveMoment() {
        return new TimeTravellerMemento(currentState);
    }

    public void travelBackToMoment(TimeTravellerMemento m) {
        currentState = m.getState();
    }
}
