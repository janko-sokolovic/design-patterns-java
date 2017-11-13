import factory.Car;
import factory.CarFactory;
import observer.AppNotificationObserver;
import observer.Blog;
import observer.EmailObserver;
import strategy.Context;
import strategy.SendEmailMessageStrategy;
import strategy.SendLetterMessageStrategy;
import strategy.SendMessageStrategy;

public class Main {

    public static void main(String[] args) {

        testFactory();

        testStrategy();

        testObserver();
    }

    private static void testFactory() {
        Car electricCar = CarFactory.create("electric");
        Car iceCar = CarFactory.create("ice");

        System.out.println("Electric car: " + electricCar);
        System.out.println("Electric car: " + iceCar);

    }

    private static void testStrategy() {
        SendMessageStrategy emailStrategy = new SendEmailMessageStrategy();
        SendMessageStrategy letterStrategy = new SendLetterMessageStrategy();

        Context context = new Context();

        context.setStrategy(emailStrategy);
        context.sendMessage();

        context.setStrategy(letterStrategy);
        context.sendMessage();

    }

    private static void testObserver() {
        Blog blog = new Blog();

        new EmailObserver(blog);
        new AppNotificationObserver(blog);

        blog.addPost("New interesting topic");

    }

}
