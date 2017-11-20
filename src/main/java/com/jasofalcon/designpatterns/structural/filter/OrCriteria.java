package com.jasofalcon.designpatterns.structural.filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Animal> meetCriteria(List<Animal> animals) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(animals));
    }
}
