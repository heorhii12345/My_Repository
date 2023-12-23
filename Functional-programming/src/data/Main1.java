package data;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main1 {

    public static void main(String[] args) {
        Consumer<String> consumer = name ->
                System.out.println("Name is " + name);

        List<String> list = Arrays.asList("Tom", "Alice", "Bob", "Lucy");

        for (String name : list) {
            consumer.accept(name);
        }
    }

}