package maindemos;

public class ItemNewObserver extends Observer {

    public ItemNewObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

    }
}
