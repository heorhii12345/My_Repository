// ОСЬ ТУТ Я ТЕЖ не розумію - ось воно говорить "containsKey(name)" - і ось він ключ але під кодом "name"
// Будь ласка пробачте якщо я чогось не розумію, я стараюсь зрозуміти.
package homework;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        getOutput(getResult(getSearch(), getData()));
    }

    private static Map<String, String> getData() {
        Map<String, String> map = new HashMap<>();
        map.put("orange", "found.");
        map.put("plum", "found.");
        map.put("grape", "found.");
        map.put("apple", "found.");
        map.put("lemon", "found.");
        return map;
    }

    private static String getSearch() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        return scanner.nextLine().trim();
    }

    private static String getResult(String name, Map<String, String> map) {
        boolean hasContain = map.containsKey(name);
        if (hasContain) {
            String answer = map.get(name);
            return name + " " + answer;
        } else
            return name + " not found!";
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
