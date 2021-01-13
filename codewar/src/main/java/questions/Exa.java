package questions;

import java.util.HashMap;

public class Exa {
    public static void main(String[] args) {
        System.out.println("test");
        HashMap hashMap = new HashMap<>();

        Country c1 = new Country("Japan");
        Country c2 = new Country("Austria");

        hashMap.put("Sweden", "Stockholm");
        hashMap.put("Norowy", "Oslo");
        hashMap.put(c1, "Tokyo");
        hashMap.put(c2, "Vienna");
        System.out.println(hashMap);

    }

}

class Country {
    private String name;

    Country(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
