package com.jasofalcon.designpatterns.strategy;

public class SendEmailMessageStrategy implements SendMessageStrategy {

    @Override
    public void sendMessage(String message) {
        System.out.println("Message sent via email: " + message);
    }
}
