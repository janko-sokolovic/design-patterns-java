package com.jasofalcon.designpatterns.behavioral.chainofresponsibility;

import java.util.Objects;

public class Call {

    private CallType callType;
    private String number;

    public Call(final CallType callType, final String number) {
        this.callType = Objects.requireNonNull(callType);
        this.number = Objects.requireNonNull(number);
    }

    CallType getCallType() {
        return callType;
    }

    private String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Incoming " + getCallType() + " call, to the number: " + getNumber();
    }
}
