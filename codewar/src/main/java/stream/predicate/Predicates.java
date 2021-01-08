package stream.predicate;

import java.util.function.Predicate;

public class Predicates {
    public static void main (String[] args){
        Predicate<Integer> predicate= i->i>10;

        boolean isGreater= predicate.test(20);
        System.out.println(isGreater);

        boolean testing = isSmaller(i->i>10,20);
        System.out.println(testing);

        boolean both = isGreaterAndSmaller(i->i>10,integer -> integer<20,15);
        System.out.println(both);
    }

    public static boolean isSmaller(Predicate<Integer> predicate, int num){
        return predicate.test(num);
    }

    public static boolean isGreaterAndSmaller(Predicate<Integer> predicatem, Predicate<Integer> predicate2,int num1){
        Predicate<Integer> both = predicatem.and(predicate2);
      return   both.test(num1);
    }
}
