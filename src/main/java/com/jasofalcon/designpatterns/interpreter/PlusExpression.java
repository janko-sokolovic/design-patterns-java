package com.jasofalcon.designpatterns.interpreter;


public class PlusExpression implements Expression {

    @Override
    public int interpret(String context) throws NumberFormatException {
        String[] elements = context.split(" ");
        if (elements.length != 3) throw new NumberFormatException("Your input is not simple arithmetic");

        int left = Integer.parseInt(elements[0]);
        int right = Integer.parseInt(elements[2]);

        return left + right;
    }
}
