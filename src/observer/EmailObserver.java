package observer;

public class EmailObserver extends Observer {

    public EmailObserver(Blog blog) {
        this.blog = blog;
        this.blog.subscribe(this);
    }

    @Override
    public void update() {
        System.out.println("New blog post arrived via email! -> " + blog.getLatest());
    }
}
