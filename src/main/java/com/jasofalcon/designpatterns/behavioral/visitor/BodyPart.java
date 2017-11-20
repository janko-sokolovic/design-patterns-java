package com.jasofalcon.designpatterns.behavioral.visitor;

public interface BodyPart {
    void accept(BodyPartVisitor visitor);
}
