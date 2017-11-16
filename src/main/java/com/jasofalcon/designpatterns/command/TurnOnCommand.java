package com.jasofalcon.designpatterns.command;

public class TurnOnCommand implements Command {
    TV tv;

    public TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }
}
