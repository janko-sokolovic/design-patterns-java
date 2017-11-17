package com.jasofalcon.designpatterns.visitor;

public class HealthInfoVisitor implements BodyPartVisitor {
    @Override
    public void visit(Heart heart) {
        System.out.println("Checking heart health...");
    }

    @Override
    public void visit(Lungs lungs) {
        System.out.println("Checking lungs health...");
    }

    @Override
    public void visit(Stomach stomach) {
        System.out.println("Checking stomach health...");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Checking whole body health...");
    }
}
