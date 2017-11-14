package abstractfactory;

public class BurgerFactory extends FastFoodAbstractFactory {
    @Override
    public Burger getBurger(String burger) {
        if("VEGGIE".equalsIgnoreCase(burger)){
            return new VeggieBurger();
        } else if ("BEEF".equalsIgnoreCase(burger)){
            return new BeefBurger();
        }
        return null;
    }

    @Override
    public Pizza getPizza(String pizza) {
        return null;
    }
}
