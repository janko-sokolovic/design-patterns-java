package com.jasofalcon.designpatterns.filter;

import java.util.List;

public interface Criteria {
    List<Animal> meetCriteria(List<Animal> animals);
}
