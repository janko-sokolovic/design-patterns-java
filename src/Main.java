import builder.House;
import builder.House.HouseBuilder;
import factory.Car;
import factory.CarFactory;
import observer.AppNotificationObserver;
import observer.Blog;
import observer.EmailObserver;
import strategy.Context;
import strategy.SendEmailMessageStrategy;
import strategy.SendLetterMessageStrategy;
import strategy.SendMessageStrategy;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        testFactory();

        testStrategy();

        testObserver();

        testBuilder();
    }


    private static void testFactory() {
        out.println("---- Testing Factory Pattern ----");
        Car electricCar = CarFactory.create("electric");
        Car iceCar = CarFactory.create("ice");

        out.println("Electric car: " + electricCar);
        out.println("Electric car: " + iceCar);
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
    }

}
