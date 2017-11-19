package com.jasofalcon.designpatterns;

import com.jasofalcon.designpatterns.abstractfactory.Burger;
import com.jasofalcon.designpatterns.abstractfactory.FastFoodAbstractFactory;
import com.jasofalcon.designpatterns.abstractfactory.FastFoodFactoryProvider;
import com.jasofalcon.designpatterns.abstractfactory.Pizza;
import com.jasofalcon.designpatterns.bridge.*;
import com.jasofalcon.designpatterns.builder.House;
import com.jasofalcon.designpatterns.chainofresponsibility.*;
import com.jasofalcon.designpatterns.command.*;
import com.jasofalcon.designpatterns.composite.Employee;
import com.jasofalcon.designpatterns.decorator.AmazonParrot;
import com.jasofalcon.designpatterns.decorator.Bird;
import com.jasofalcon.designpatterns.decorator.Parrot;
import com.jasofalcon.designpatterns.facade.Hero;
import com.jasofalcon.designpatterns.factory.Car;
import com.jasofalcon.designpatterns.factory.CarFactory;
import com.jasofalcon.designpatterns.filter.*;
import com.jasofalcon.designpatterns.flyweight.Jewelry;
import com.jasofalcon.designpatterns.interpreter.MinusExpression;
import com.jasofalcon.designpatterns.interpreter.PlusExpression;
import com.jasofalcon.designpatterns.iterator.Iterator;
import com.jasofalcon.designpatterns.iterator.NinjaTurtle;
import com.jasofalcon.designpatterns.iterator.NinjaTurtlesRepository;
import com.jasofalcon.designpatterns.observer.AppNotificationObserver;
import com.jasofalcon.designpatterns.observer.Blog;
import com.jasofalcon.designpatterns.observer.EmailObserver;
import com.jasofalcon.designpatterns.prototype.Icecream;
import com.jasofalcon.designpatterns.singleton.LazyInitializedSingleton;
import com.jasofalcon.designpatterns.state.Woman;
import com.jasofalcon.designpatterns.strategy.Context;
import com.jasofalcon.designpatterns.strategy.SendEmailMessageStrategy;
import com.jasofalcon.designpatterns.strategy.SendLetterMessageStrategy;
import com.jasofalcon.designpatterns.strategy.SendMessageStrategy;
import com.jasofalcon.designpatterns.visitor.Body;
import com.jasofalcon.designpatterns.visitor.BodyPart;
import com.jasofalcon.designpatterns.visitor.HealthInfoVisitor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

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

        testState();

        testVisitor();

        testFilter();

        testComposite();

        testFlyweight();

        testChainOfResponsibility();

        testInterpreter();
    }

    private static void testVisitor() {
        out.println("---- Testing Visitor Pattern ----");

        BodyPart body = new Body();
        body.accept(new HealthInfoVisitor());

        out.println();
    }

    private static void testState() {
        out.println("---- Testing Iterator Pattern ----");

        Woman woman = new Woman();

        woman.buyHerCookies();
        woman.observeState();

        woman.pmsComing();
        woman.observeState();

        out.println();
    }

    private static void testIterator() {
        out.println("---- Testing Iterator Pattern ----");

        NinjaTurtlesRepository tnmtRepository = new NinjaTurtlesRepository();

        for (Iterator iterator = tnmtRepository.getIterator(); iterator.hasNext(); ) {

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

        Icecream icecream = new Icecream(2.2f, "Strawberry");
        Icecream clone = (Icecream) icecream.getClone();

        icecream.setPrice(1.2f);

        System.out.println("Clone's price stayed unchanged -> " + clone.getPrice());

        out.println();
    }


    private static void testFilter() {
        out.println("---- Testing Filter Pattern ----");

        List<Animal> animals = Arrays.asList(
                new Animal("Lion", "Carnivore", "Vertebrate"),
                new Animal("Jellyfish", "Carnivore", "Ivertebrate"),
                new Animal("Horse", "Herbivore", "Vertebrate"),
                new Animal("Spider", "Carnivore", "Ivertebrate"),
                new Animal("Elephant", "Herbivore", "Vertebrate"),
                new Animal("Snail", "Herbivore", "Ivertebrate")
        );

        Criteria carnivoreCriteria = new CarnivoreCriteria();
        Criteria herbivoreCriteria = new HerbivoreCriteria();
        Criteria vertebrateCriteria = new VertebrateCriteria();
        Criteria carnivoreAndVertebrate = new AndCriteria(carnivoreCriteria, vertebrateCriteria);
        Criteria orCriteria = new OrCriteria(herbivoreCriteria, vertebrateCriteria);

        System.out.print("Herbivores: ");
        System.out.print(herbivoreCriteria.meetCriteria(animals).stream().map(Animal::getName).collect(Collectors.joining(", ")));
        System.out.println();

        System.out.print("Vertebrate carnivors: ");
        System.out.print(carnivoreAndVertebrate.meetCriteria(animals).stream().map(Animal::getName).collect(Collectors.joining(", ")));
        System.out.println();

        out.println();
    }

    private static void testComposite() {
        out.println("---- Testing Composite Pattern ----");

        Employee manager = new Employee("El hefe");
        manager.hire(new Employee("Bob"));
        manager.hire(new Employee("John"));

        System.out.println(manager);

        manager.getSubordinates().forEach(e -> System.out.println(e.toString()));

        out.println();
    }


    private static void testFlyweight() {
        out.println("---- Testing Flyweight Pattern ----");

        Jewelry jewelry = new Jewelry();
        jewelry.enumerateGems();

        out.println();
    }

    private static void testChainOfResponsibility() {
        out.println("---- Testing Chain of Responsibility Pattern ----");

        CallDispatcher interCityDispatcher = new InterCityDispatcher(null);
        CallDispatcher interCountryDispatcher = new InterCountryDispatcher(interCityDispatcher);

        CallDispatcher chain = new InternationalCallDispatcher(interCountryDispatcher);

        Call internationalCall = new Call(CallType.INTERNATIONAL, "00381 64 1234 567");
        Call interCountryCall = new Call(CallType.INTERCOUNTRY, "011 1234 567");
        Call interCityCall = new Call(CallType.INTERCITY, "1234 567");

        chain.dispatchCall(internationalCall);
        chain.dispatchCall(interCountryCall);
        chain.dispatchCall(interCityCall);

        out.println();
    }


    private static void testInterpreter() {
        out.println("---- Testing Interpreter Pattern ----");

        String contextPlus = "3 + 5";
        String contextMinus = "3 - 5";

        // ..  check if + or - in some way

        try {
            System.out.println("Expression " + contextPlus + " yields: " + new PlusExpression().interpret(contextPlus));
            System.out.println("Expression " + contextMinus + " yields: " + new MinusExpression().interpret(contextPlus));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        out.println();
    }

}
