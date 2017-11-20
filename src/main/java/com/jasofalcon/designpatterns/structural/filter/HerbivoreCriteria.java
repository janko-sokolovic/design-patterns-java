package com.jasofalcon.designpatterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

public class HerbivoreCriteria implements Criteria {
    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        return animals.stream()
                .filter(a -> "Herbivore".equalsIgnoreCase(a.getFoodChainRole()))
                .collect(Collectors.toList());
    }
}
