package maindemos;

public class ProductBuilder {

    public Selection prepareSportshop() {
        Selection selection = new Selection();
        selection.addItem(new redandBluetshirts());
        selection.addItem(new blackandWhitecaps());
        return selection;
    }

    public Selection prepareAcquired2Items() {
        Selection selection = new Selection();
        selection.addItem(new redtshirtWhitecap());
        selection.addItem(new Bluetshirtblackcap());
        return selection;
    }
}
