package stream.consumers;

import java.util.function.Consumer;

public class Comsumers {
    public static void main(String[]  args){
        Consumer<String> consumer= System.out::println;
        consumer.accept("hello");

        firstAndThen("test");
    }

    public static void firstAndThen(String input){
        Consumer<String> str1= (s1)->System.out.println(s1.toLowerCase());
        Consumer<String> str2= (s2)->System.out.println(s2.toUpperCase());

        Consumer<String> res=  str1.andThen(str2);
        res.accept(input);

    }
}
