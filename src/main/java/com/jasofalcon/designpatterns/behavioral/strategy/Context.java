package com.jasofalcon.designpatterns.behavioral.strategy;

public class Context {
    private SendMessageStrategy strategy;

    public void setStrategy(SendMessageStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendMessage() {
        this.strategy.sendMessage("Hello world");
    }
}
