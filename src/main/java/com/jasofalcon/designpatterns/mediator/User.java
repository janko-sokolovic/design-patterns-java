package com.jasofalcon.designpatterns.mediator;


import java.util.Objects;

public class User {
    private final String name;
    private final long id;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        this.id = mediator.createID();
    }

    public void sendMessage(String message) {
        mediator.pushMessage(this, message);
    }

    void receiveMessage(String message) {
        System.out.println(this + " recieved message: " + message);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (null == o) return false;
        if (getClass() != o.getClass()) return false;

        User otherUser = (User) o;
        return Objects.equals(id, otherUser.id) && Objects.equals(name, otherUser.name);
    }
}
