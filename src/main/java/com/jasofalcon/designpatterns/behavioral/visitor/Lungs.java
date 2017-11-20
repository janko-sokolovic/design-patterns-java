package com.jasofalcon.designpatterns.behavioral.visitor;

public class Lungs implements BodyPart {
    @Override
    public void accept(BodyPartVisitor visitor) {
        visitor.visit(this);
    }
}
