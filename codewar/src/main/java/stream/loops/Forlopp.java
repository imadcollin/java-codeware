package stream.loops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Forlopp {
    public static void main(String[] args) {

        printHashMap(capitals());
        printWithStream(capitals());

        printList(getNames());
        printLamda(getNames());
    }

    public static HashMap<String, String> capitals() {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Sweden", "Stockholm");
        capitals.put("Norway", "Oslo");
        capitals.put("Finlad", "Helsinki");
        return capitals;
    }

    public static void printHashMap(HashMap hashMap) {
        for (Object o : hashMap.keySet()) {
            System.out.println(o + " -> " + hashMap.get(o));
        }
    }

    public static void printWithStream(HashMap hashMap) {
        hashMap.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    public static List<String> getNames() {

        return Arrays.asList("Adam", "Bon", "Mac");
    }

    public static void printList(List list) {
        for (Object o : list
        ) {
            System.out.println(o);
        }
    }

    public static void printLamda(List list) {
        list.forEach(System.out::println);
    }

}
