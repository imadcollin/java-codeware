package stream.supliers;

import java.util.function.Supplier;

public class Main {
    public static void main (String[] args ){
        Supplier<Student> studentSuppliers= ()->new Student(17,"Bob");
        System.out.println( studentSuppliers.get());
    }
}
