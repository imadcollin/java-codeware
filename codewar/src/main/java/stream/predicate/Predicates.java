package stream.predicate;

import java.util.function.Predicate;

public class Predicates {
    public static void main (String[] args){
        Predicate<Integer> predicate= i->i>10;

        boolean isGreater= predicate.test(20);
        System.out.println(isGreater);

        boolean testing = isSmaller(i->i>10,20);
        System.out.println(testing);
    }

    public static boolean isSmaller(Predicate<Integer> predicate, int num){
        return predicate.test(num);
    }
}
