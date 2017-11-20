package com.jasofalcon.designpatterns.behavioral.strategy;

public class SendLetterMessageStrategy implements SendMessageStrategy {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent via letter: " + message);
    }
}
