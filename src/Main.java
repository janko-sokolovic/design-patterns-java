import abstractfactory.Burger;
import abstractfactory.FastFoodAbstractFactory;
import abstractfactory.FastFoodFactoryProvider;
import abstractfactory.Pizza;
import builder.House;
import builder.House.HouseBuilder;
import factory.Car;
import factory.CarFactory;
import observer.AppNotificationObserver;
import observer.Blog;
import observer.EmailObserver;
import singleton.EagerInitializedSingleton;
import singleton.LazyInitializedSingleton;
import strategy.Context;
import strategy.SendEmailMessageStrategy;
import strategy.SendLetterMessageStrategy;
import strategy.SendMessageStrategy;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        testFactory();

        testAbstractFactory();

        testStrategy();

        testObserver();

        testBuilder();

        testSingletons();
    }



    private static void testFactory() {
        out.println("---- Testing Factory Pattern ----");
        Car electricCar = CarFactory.create("electric");
        Car iceCar = CarFactory.create("ice");

        out.println("Electric car: " + electricCar);
        out.println("Electric car: " + iceCar);
        out.println();
    }

    private static void testAbstractFactory() {
        out.println("---- Testing Abstract Factory Pattern ----");

        FastFoodAbstractFactory burgerFactory = FastFoodFactoryProvider.getFactory("BURGER");
        Burger beefBurger = burgerFactory.getBurger("BEEF");

        beefBurger.eatBurger();

        FastFoodAbstractFactory pizzaFactory = FastFoodFactoryProvider.getFactory("PIZZA");
        Pizza pepperoniPizza = pizzaFactory.getPizza("PEPPERONI");
        pepperoniPizza.eatPizza();

        out.println();
    }

    private static void testStrategy() {
        out.println("---- Testing Strategy Pattern ----");
        SendMessageStrategy emailStrategy = new SendEmailMessageStrategy();
        SendMessageStrategy letterStrategy = new SendLetterMessageStrategy();

        Context context = new Context();

        context.setStrategy(emailStrategy);
        context.sendMessage();

        context.setStrategy(letterStrategy);
        context.sendMessage();

        out.println();
    }

    private static void testObserver() {
        out.println("---- Testing Observer Pattern ----");
        Blog blog = new Blog();

        new EmailObserver(blog);
        new AppNotificationObserver(blog);

        blog.addPost("New interesting topic");

        out.println();
    }

    private static void testBuilder() {
        out.println("---- Testing Builder Pattern ----");
        HouseBuilder houseBuilder = new HouseBuilder("red-roof", "glass-windows");
        House house = houseBuilder.setIsSmartHouse(true)
                //.hasPorch(false)   // We do not need to provide optionals.
                .setGarage("smart-garage")
                .build();

        out.println("House created -> " + house);
        out.println();
    }

    private static void testSingletons() {
        out.println("---- Testing Singleton Pattern ----");

        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        singleton.setName("Happy Singleton");

        out.println("Singleton name: " + singleton.getName());
        LazyInitializedSingleton newSingleton = LazyInitializedSingleton.getInstance();

        out.println("Still the same name: " + newSingleton.getName());

        out.println();
    }


}
