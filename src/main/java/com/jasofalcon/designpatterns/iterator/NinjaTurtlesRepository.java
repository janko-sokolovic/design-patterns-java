package com.jasofalcon.designpatterns.iterator;

import java.util.Arrays;
import java.util.List;

public class NinjaTurtlesRepository implements Container {

    private List<NinjaTurtle> turtles = Arrays.asList(
            new NinjaTurtle("Leonardo", "Blue", "Twin Katana"),
            new NinjaTurtle("Rafaello", "Red", "Sai"),
            new NinjaTurtle("Donatello", "Purple", "Bo"),
            new NinjaTurtle("Michelangelo", "Orange", "Nunchaku")
    );

    @Override
    public Iterator getIterator() {
        return new NinjaTurtleIterator();
    }

    private class NinjaTurtleIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            return turtles.size() > index;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return turtles.get(index++);
            }
            return null;
        }
    }

}
