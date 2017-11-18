package com.jasofalcon.designpatterns.filter;

import java.util.List;
import java.util.stream.Collectors;

public class IvertebrateCriteria implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        return animals.stream().filter(a -> "Ivertebrate".equalsIgnoreCase(a.getType()))
                .collect(Collectors.toList());
    }
}
