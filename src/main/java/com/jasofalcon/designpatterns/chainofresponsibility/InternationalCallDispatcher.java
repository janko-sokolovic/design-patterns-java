package com.jasofalcon.designpatterns.chainofresponsibility;

public class InternationalCallDispatcher extends CallDispatcher {

    public InternationalCallDispatcher(CallDispatcher dispatcher) {
        super(dispatcher);
    }

    @Override
    public void dispatchCall(Call call) {
        if (call.getCallType() == CallType.INTERNATIONAL) {
            printHandling(call);
        } else {
            super.dispatchCall(call);
        }
    }

    @Override
    public String toString() {
        return "International Dispatcher";
    }
}
