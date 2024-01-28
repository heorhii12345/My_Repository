package maindemos;

public abstract class Item1 implements Item {

    @Override
    public Item2 item2() {
        return new Smartcaps();
    }

    @Override
    public abstract float price();
}
