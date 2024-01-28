package maindemos;

public class ObserverPatternDemo {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new Item2Observer(subject);
        new ItemNewObserver(subject);
        new Item1Observer(subject);

        System.out.println("Substance State 1:");
        subject.setState(0);
        System.out.println("Weight: 1g");
        System.out.println("Color: White");

        System.out.println("\nSubstance State 2 - temperature rises:");
        subject.setState(1);
        System.out.println("Weight: 2g");
        System.out.println("Color: black");
    }
}
