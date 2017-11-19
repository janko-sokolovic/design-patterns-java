package com.jasofalcon.designpatterns.chainofresponsibility;

public class InterCityDispatcher extends CallDispatcher {

    public InterCityDispatcher(CallDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public void dispatchCall(Call call) {
        if (call.getCallType() == CallType.INTERCITY) {
            printHandling(call);
        } else {
            super.dispatchCall(call);
        }

    }

    @Override
    public String toString() {
        return "City Dispatcher";
    }
}
