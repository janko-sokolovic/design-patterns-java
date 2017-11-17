package com.jasofalcon.designpatterns.visitor;

public class Heart implements BodyPart {
    @Override
    public void accept(BodyPartVisitor visitor) {
        visitor.visit(this);
    }
}
