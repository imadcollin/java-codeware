package stream.supliers;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Suppliers {
    public static void main (String[]  args){
        Supplier<String> supplier= ()->"test";
        System.out.println(supplier.get());

        generateRandoms();
    }
    public static void generateRandoms(){
        Supplier<Integer> numbers= ()-> new Random().nextInt(10);
        Stream.generate(numbers).limit(5).forEach(System.out::println);
    }
}
