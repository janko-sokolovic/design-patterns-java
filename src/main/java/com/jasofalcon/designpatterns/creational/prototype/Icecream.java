package com.jasofalcon.designpatterns.creational.prototype;

public class Icecream implements Prototype {

    private float price;
    private String flavor;

    public Icecream() {
    }

    public Icecream(float price, String flavor) {
        this.price = price;
        this.flavor = flavor;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public Prototype getClone() {
        return new Icecream(price, flavor);
    }
}
