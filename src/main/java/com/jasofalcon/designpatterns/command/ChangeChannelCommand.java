package com.jasofalcon.designpatterns.command;

public class ChangeChannelCommand implements Command {
    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
