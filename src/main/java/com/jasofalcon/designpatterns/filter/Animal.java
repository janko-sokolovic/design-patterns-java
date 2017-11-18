package com.jasofalcon.designpatterns.filter;

public class Animal {
    private final String name;
    private String foodChainRole;
    private String type;

    public Animal(String name, String foodChainRole, String type) {
        this.name = name;
        this.foodChainRole = foodChainRole;
        this.type = type;
    }

    String getFoodChainRole() {
        return foodChainRole;
    }

    String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
