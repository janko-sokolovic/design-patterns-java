package com.jasofalcon.designpatterns.behavioral.mediator;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class WhatsAppGroupChat implements Mediator {

    private Set<User> users;
    private AtomicLong idCounter = new AtomicLong();

    public WhatsAppGroupChat() {
        users = new HashSet<>();
    }

    @Override
    public void pushMessage(User user, String message) {
        System.out.println(user + " sends: " + message);
        users.stream().filter(u -> !u.equals(user))
                .forEach(u -> u.receiveMessage(message));
        System.out.println();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public long createID() {
        return idCounter.getAndIncrement();
    }

}
