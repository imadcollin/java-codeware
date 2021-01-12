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

        boolean or = or(i->i>10, x->x<20);
        System.out.println(or);

        boolean isEqual= isEqual("test");
        System.out.println(isEqual);
    }

    public static boolean isSmaller(Predicate<Integer> predicate, int num){
        return predicate.test(num);
    }

    public static boolean isGreaterAndSmaller(Predicate<Integer> predicate, Predicate<Integer> predicate2,int num1){
        Predicate<Integer> both = predicate.and(predicate2);
      return   both.test(num1);
    }

    public static boolean or(Predicate<Integer> p1, Predicate<Integer> p2 ){
        Predicate<Integer> or = p1.or(p2);
         return  or.test(20);
    }

    public static boolean isEqual(String str){
        Predicate<String> predicate= Predicate.isEqual("test");
        return  predicate.test(str);

    }
}
