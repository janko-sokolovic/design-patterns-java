package com.jasofalcon.designpatterns.behavioral.mediator;

public interface Mediator {
    void addUser(User user);

    void pushMessage(User source, String message);

    long createID();
}
