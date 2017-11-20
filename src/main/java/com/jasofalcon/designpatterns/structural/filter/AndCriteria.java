package com.jasofalcon.designpatterns.structural.filter;

import java.util.List;

public class AndCriteria implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(animals));
    }
}
