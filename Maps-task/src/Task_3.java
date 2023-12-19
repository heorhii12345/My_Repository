import java.util.LinkedHashMap;

public class Task_3 {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> mapA = new LinkedHashMap<>();
        mapA.put(1, ") Tom - tom@mail.com");
        mapA.put(2, ") Lisa - lisa@mail.com");
        mapA.put(3, ") Alice - alisa@mail.com");
        mapA.put(4, ") Denis - den@mail.com");

        System.out.println("Initial contacts:");

        LinkedHashMap<Integer, String> mapB = new LinkedHashMap<>();
        mapB.put(1, ") Tom - tomasdev@glob.net");

        mapA.forEach((key, value) ->
                System.out.println(key + value));
        System.out.println("\nUpdated contacts:");
        mapA.putAll(mapB);
        mapA.forEach((key, value) ->
                System.out.println(key + value));
    }
}

