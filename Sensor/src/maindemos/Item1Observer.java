package maindemos;

public class Item1Observer extends Observer {

    public Item1Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

    }
}
