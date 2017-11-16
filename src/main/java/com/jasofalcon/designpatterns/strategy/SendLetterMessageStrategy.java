package com.jasofalcon.designpatterns.strategy;

public class SendLetterMessageStrategy implements SendMessageStrategy {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent via letter: " + message);
    }
}
