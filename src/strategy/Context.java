package strategy;

public class Context {
    SendMessageStrategy strategy;

    public void setStrategy(SendMessageStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendMessage() {
        this.strategy.sendMessage("Hello world");
    }
}
