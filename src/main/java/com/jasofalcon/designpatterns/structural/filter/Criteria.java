package com.jasofalcon.designpatterns.structural.filter;

import java.util.List;

public interface Criteria {
    List<Animal> meetCriteria(List<Animal> animals);
}
