//У цьому завданні, Я не зміг зробити так щоб найменування товару - ключ, кількість - значення. Бо не дозволяє самі
//кодові параметри, у третьому завданні можливо зробити як на умові. Пробачте якщо щось не так, я стараюсь виправляти
//одразу коли я розумію що я зробив помилку, але іноді я навіть її не помічаю.
package homework;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm1 = new HashMap<>();

        hm1.put(1, ") orange, 12 kg");
        hm1.put(2, ") banana, 25 kg");
        hm1.put(3, ") lemon, 8 kg");
        hm1.put(4, ") pineapple, 13 kg");
        hm1.put(5, ") grape, 9 kg");

        myMethod();
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
    static void myMethod() {
        System.out.println("\nInitial data:");
    }
}

