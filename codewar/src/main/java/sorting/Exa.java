package sorting;

import java.util.HashMap;
import java.util.HashSet;

public class Exa {
    public static void main(String[] args) {
        System.out.println("test");
        HashMap hashMap = new HashMap<>();

        Country c1 = new Country("Japan");
        Country c2 = new Country("Austria");

        Country c3 = new Country("Japan");
        Country c4 = new Country("Austria");

        hashMap.put("Sweden", "Stockholm");
        hashMap.put("Norowy", "Oslo");
        hashMap.put(c1, "Tokyo");
        hashMap.put(c2, "Vienna");
        System.out.println(hashMap);

        // DUPLICATION CHECK
        HashSet hashSet = new HashSet<>();
        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);
        hashSet.add(c4);
        System.out.println(hashSet);

        // DUPLICATION CHECK
        HashSet hashSet2 = new HashSet<>();
        hashSet2.add("test1");
        hashSet2.add("test2");
        hashSet2.add("test1");
        hashSet2.add("test2");
        System.out.println(hashSet2);

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

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj == null)
            return false;
        else if (!(obj instanceof Country))
            return false;

        else if (this == obj)
            return true;
        else if (obj instanceof Country) {
            Country country = (Country) obj;
            return country.name == ((Country) obj).name;
        }
        return false;
    }
    // @Override
    // public boolean equals(Object obj) {
    // if (this == obj)
    // return true;
    // if (obj == null)
    // return false;
    // if (getClass() != obj.getClass())
    // return false;
    // Country other = (Country) obj;
    // if (name == null) {
    // if (other.name != null)
    // return false;
    // } else if (!name.equals(other.name))
    // return false;
    // return true;
    // }

}
