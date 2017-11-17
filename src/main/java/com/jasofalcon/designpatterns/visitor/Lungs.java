package com.jasofalcon.designpatterns.visitor;

public class Lungs implements BodyPart {
    @Override
    public void accept(BodyPartVisitor visitor) {
        visitor.visit(this);
    }
}
