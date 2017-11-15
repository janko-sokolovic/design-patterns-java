package prototype;

public class Icecream implements Prototype {

    public float getPrice() {
        return price;
    }

    public Icecream() {
    }

    public Icecream(float price, String flavor) {
        this.price = price;
        this.flavor = flavor;
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

    private float price;
    private String flavor;


    @Override
    public Prototype getClone() {
        return new Icecream(price, flavor);
    }
}
