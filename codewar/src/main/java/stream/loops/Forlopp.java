package stream.loops;

import java.util.HashMap;

public class Forlopp {
    public static void main(String[] args) {

        printHashMap(capitals());
        printWithStream(capitals());
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
}
