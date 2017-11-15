package bridge;

public abstract class Computer {

    OperatingSystem operatingSystem;

    public Computer(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void turnOn();
}
