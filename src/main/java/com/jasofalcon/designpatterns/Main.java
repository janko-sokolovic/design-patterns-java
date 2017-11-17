package com.jasofalcon.designpatterns;

import static java.lang.System.out;

import com.jasofalcon.designpatterns.abstractfactory.Burger;
import com.jasofalcon.designpatterns.abstractfactory.FastFoodAbstractFactory;
import com.jasofalcon.designpatterns.abstractfactory.FastFoodFactoryProvider;
import com.jasofalcon.designpatterns.abstractfactory.Pizza;
import com.jasofalcon.designpatterns.bridge.*;
import com.jasofalcon.designpatterns.builder.House;
import com.jasofalcon.designpatterns.command.*;
import com.jasofalcon.designpatterns.decorator.AmazonParrot;
import com.jasofalcon.designpatterns.decorator.Bird;
import com.jasofalcon.designpatterns.decorator.Parrot;
import com.jasofalcon.designpatterns.facade.Hero;
import com.jasofalcon.designpatterns.factory.Car;
import com.jasofalcon.designpatterns.factory.CarFactory;
import com.jasofalcon.designpatterns.iterator.Iterator;
import com.jasofalcon.designpatterns.iterator.NinjaTurtle;
import com.jasofalcon.designpatterns.iterator.NinjaTurtlesRepository;
import com.jasofalcon.designpatterns.observer.AppNotificationObserver;
import com.jasofalcon.designpatterns.observer.Blog;
import com.jasofalcon.designpatterns.observer.EmailObserver;
import com.jasofalcon.designpatterns.prototype.Icecream;
import com.jasofalcon.designpatterns.singleton.LazyInitializedSingleton;
import com.jasofalcon.designpatterns.strategy.Context;
import com.jasofalcon.designpatterns.strategy.SendEmailMessageStrategy;
import com.jasofalcon.designpatterns.strategy.SendLetterMessageStrategy;
import com.jasofalcon.designpatterns.strategy.SendMessageStrategy;

public class Main {

    public static void main(String[] args) {

        testFactory();

        testAbstractFactory();

        testStrategy();

        testObserver();

        testBuilder();

        testSingletons();

        testPrototype();

        testBridge();

        testDecorator();
        
        testFacade();
        
        testCommand();

        testIterator();
    }

    private static void testIterator() {
        out.println("---- Testing Iterator Pattern ----");

        NinjaTurtlesRepository tnmtRepository = new NinjaTurtlesRepository();

        for(Iterator iterator = tnmtRepository.getIterator(); iterator.hasNext();){

            NinjaTurtle turtle = (NinjaTurtle) iterator.next();

            System.out.println(turtle.getName() + " of color " + turtle.getColor() + " attacks with " + turtle.getWeapon() + "!");
        }

        out.println();
    }

    private static void testCommand() {
        out.println("---- Testing Command Pattern ----");

        RemoteControl remote = new RemoteControl();

        TV tv = new TV();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command changeChannel = new ChangeChannelCommand(tv);

        remote.setCommand(turnOn);
        remote.applyCommand();

        remote.setCommand(changeChannel);
        remote.applyCommand();

        remote.setCommand(turnOff);
        remote.applyCommand();


        out.println();
    }

    private static void testFacade() {
        out.println("---- Testing Facade Pattern ----");

        Hero hero = new Hero();

        hero.attack();

        out.println();
    }

    private static void testDecorator() {
        out.println("---- Testing Decorator Pattern ----");

        Bird regularBird = new Parrot();

        regularBird.fly();

        Bird amazonBird = new AmazonParrot(new Parrot());

        amazonBird.fly();

        out.println();
    }

    private static void testBridge() {
        out.println("---- Testing Bridge Pattern ----");

        Computer laptop = new Laptop(new Linux());
        laptop.turnOn();

        Computer desktop = new Desktop(new Windows());
        desktop.turnOn();

        out.println();
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
        assert burgerFactory != null;
        Burger beefBurger = burgerFactory.getBurger("BEEF");

        beefBurger.eatBurger();

        FastFoodAbstractFactory pizzaFactory = FastFoodFactoryProvider.getFactory("PIZZA");
        assert pizzaFactory != null;
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
        House.HouseBuilder houseBuilder = new House.HouseBuilder("red-roof", "glass-windows");
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

    private static void testPrototype() {
        out.println("---- Testing Prototype Pattern ----");

        Icecream icecream = new Icecream( 2.2f, "Strawberry");
        Icecream clone = (Icecream) icecream.getClone();

        icecream.setPrice(1.2f);

        System.out.println("Clone's price stayed unchanged -> " + clone.getPrice());

        out.println();
    }
}
