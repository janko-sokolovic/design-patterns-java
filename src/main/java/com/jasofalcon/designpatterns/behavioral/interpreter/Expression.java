package com.jasofalcon.designpatterns.behavioral.interpreter;


public interface Expression {
    int interpret(String context) throws NumberFormatException;
}
