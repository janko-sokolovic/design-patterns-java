package com.jasofalcon.designpatterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class VertebrateCriteria implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        return animals.stream().filter(a -> "Vertebrate".equalsIgnoreCase(a.getType()))
                .collect(Collectors.toList());
    }
}
