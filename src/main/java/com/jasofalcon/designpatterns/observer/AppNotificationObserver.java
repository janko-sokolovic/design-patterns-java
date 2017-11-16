package com.jasofalcon.designpatterns.observer;

public class AppNotificationObserver  extends Observer{

    public AppNotificationObserver(Blog blog) {
        this.blog = blog;
        this.blog.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("New blog post arrived via notification! -> " + blog.getLatest());
    }
}
