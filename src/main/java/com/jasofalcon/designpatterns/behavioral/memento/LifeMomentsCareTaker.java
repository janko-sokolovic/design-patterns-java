package com.jasofalcon.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class LifeMomentsCareTaker {
    private List<TimeTravellerMemento> lifeMoments = new ArrayList<>();

    public void add(TimeTravellerMemento state) {
        lifeMoments.add(state);
    }

    public TimeTravellerMemento getLifeMoment(int index) {
        System.out.println("Travels back to time...");
        return lifeMoments.get(index);
    }
}
