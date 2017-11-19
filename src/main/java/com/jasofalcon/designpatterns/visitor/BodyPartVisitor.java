package com.jasofalcon.designpatterns.visitor;

public interface BodyPartVisitor {
    void visit(Heart heart);

    void visit(Lungs lungs);

    void visit(Stomach stomach);

    void visit(Body body);
}
