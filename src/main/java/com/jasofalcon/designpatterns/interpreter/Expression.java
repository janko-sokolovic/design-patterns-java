package com.jasofalcon.designpatterns.interpreter;


public interface Expression {
    int interpret(String context) throws NumberFormatException;
}
