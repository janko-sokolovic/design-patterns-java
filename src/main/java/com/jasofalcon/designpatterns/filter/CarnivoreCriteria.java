package com.jasofalcon.designpatterns.filter;

import java.util.List;
import java.util.stream.Collectors;

public class CarnivoreCriteria implements Criteria {
    public List<Animal> meetCriteria(List<Animal> animals) {
        return animals.stream()
                .filter(a -> "Carnivore".equalsIgnoreCase(a.getFoodChainRole()))
                .collect(Collectors.toList());
    }
}
