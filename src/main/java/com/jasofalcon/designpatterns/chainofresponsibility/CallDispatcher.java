package com.jasofalcon.designpatterns.chainofresponsibility;

public abstract class CallDispatcher {
    private CallDispatcher next;

    CallDispatcher(CallDispatcher next) {
        this.next = next;
    }

    public void dispatchCall(Call call) {
        if (null != next) {
            next.dispatchCall(call);
        }
    }

    void printHandling(Call call) {
        System.out.println(this + " is handling " + call + "...");

    }

    @Override
    public abstract String toString();

}
