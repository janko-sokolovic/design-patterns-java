package abstractfactory;

public class PizzaFactory extends FastFoodAbstractFactory {
    @Override
    public Burger getBurger(String burger) {
        return null;
    }

    @Override
    public Pizza getPizza(String pizza) {
        if ("PEPPERONI".equalsIgnoreCase(pizza)) {
            return new PepperoniPizza();
        } else if ("CAPRICCIOSA".equalsIgnoreCase(pizza)) {
            return new CapricciosaPizza();
        }
        return null;
    }
}
