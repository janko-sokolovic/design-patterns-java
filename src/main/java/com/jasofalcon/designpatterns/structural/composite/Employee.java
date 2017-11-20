package com.jasofalcon.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Employee> subordinates;

    public Employee(String name) {
        this.name = name;
        subordinates = new ArrayList<>();
    }

    public void hire(Employee employee) {
        subordinates.add(employee);
    }

    public void fire(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name;
    }
}
