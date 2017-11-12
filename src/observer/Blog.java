package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Observable
 */
public class Blog {
    private List<Observer> observers = new ArrayList<>();
    private List<String> posts = new ArrayList<>();

    public void addPost(String newPost){
        posts.add(newPost);
        notifyAllObservers();
    }

    void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubsribe(Observer observer) {
        observers.remove(observer);
    }

    private void notifyAllObservers() {
        observers.forEach(Observer::update);
    }
}
