package com.jasofalcon.designpatterns.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class Body implements BodyPart {

    private List<BodyPart> bodyParts;

    public Body() {
        bodyParts = Arrays.asList(new Heart(), new Lungs(), new Stomach());
    }

    @Override
    public void accept(BodyPartVisitor visitor) {
        bodyParts.forEach(b -> b.accept(visitor));
        visitor.visit(this);
    }
}
