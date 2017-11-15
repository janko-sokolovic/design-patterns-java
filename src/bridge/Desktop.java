package bridge;

public class Desktop extends Computer {

    public Desktop(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop running " + operatingSystem + " is booting...");
    }
}
