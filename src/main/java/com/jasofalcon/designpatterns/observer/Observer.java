package com.jasofalcon.designpatterns.observer;

import com.jasofalcon.designpatterns.observer.Blog;

public abstract class Observer {
    Blog blog;

    public abstract void update();
}
