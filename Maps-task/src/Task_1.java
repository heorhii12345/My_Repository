import java.util.HashMap;
import java.util.Map;

public class Task_1 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm1 = new HashMap<>();

        hm1.put(1, ") orange, 12 kg");
        hm1.put(2, ") banana, 25 kg");
        hm1.put(3, ") lemon, 8 kg");
        hm1.put(4, ") pineapple, 13 kg");
        hm1.put(5, ") grape, 9 kg");

        System.out.println("\nInitial data:");
        for (Map.Entry<Integer, String> m : hm1.entrySet()) {
            System.out.println(m.getKey() + m.getValue());
        }

        hm1.put(3, ") plum, 15 kg");
        hm1.put(4, ") lemon, 8 kg");
        hm1.put(5, ") pineapple, 13 kg");
        hm1.put(6, ") grape, 9 kg");
        System.out.println("\nUpdated data:");

        for (Map.Entry<Integer, String> m : hm1.entrySet()) {
            System.out.println(m.getKey() + m.getValue());
        }
    }
}
