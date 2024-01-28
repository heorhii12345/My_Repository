package maindemos;

public abstract class Token implements Item {

    @Override
    public Item2 item2() {
        return new Item3();
    }

    @Override
    public abstract float price();
}
