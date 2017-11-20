package com.jasofalcon.designpatterns.behavioral.chainofresponsibility;

public class InterCountryDispatcher extends CallDispatcher {

    public InterCountryDispatcher(CallDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public void dispatchCall(Call call) {
        if (call.getCallType() == CallType.INTERCOUNTRY) {
            printHandling(call);
        } else {
            super.dispatchCall(call);
        }
    }

    @Override
    public String toString() {
        return "Country Dispatcher";
    }
}
