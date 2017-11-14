package abstractfactory;

public class FastFoodFactoryProvider {

    public static FastFoodAbstractFactory getFactory(String factory) {
        if("BURGER".equalsIgnoreCase(factory)){
            return new BurgerFactory();
        }else if("PIZZA".equalsIgnoreCase(factory)){
            return new PizzaFactory();
        }
        return null;
    }
}
