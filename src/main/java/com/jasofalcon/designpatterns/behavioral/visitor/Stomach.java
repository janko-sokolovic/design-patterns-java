package com.jasofalcon.designpatterns.behavioral.visitor;

public class Stomach implements BodyPart {
    @Override
    public void accept(BodyPartVisitor visitor) {
        visitor.visit(this);
    }
}
