package maindemos;

public class Item2Observer extends Observer {

    public Item2Observer(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Substance temperature: "
                + Integer.toOctalString(subject.getState()));
    }
}
