package questions;

import java.util.HashSet;

public class Exb {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Adam");
        Student s2 = new Student(2, "Bob");
        Student s3 = new Student(3, "Adam");

        HashSet hashSet = new HashSet<>();
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);

        System.out.println(hashSet.size());
        System.out.println(hashSet);

    }
}

class Student {
    private final int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }

    @Override
    public int hashCode() {
        return 33;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
