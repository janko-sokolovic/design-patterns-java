package com.jasofalcon.designpatterns.visitor;

public interface BodyPart {
   void accept(BodyPartVisitor visitor);
}
