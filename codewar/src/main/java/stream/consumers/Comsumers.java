package stream.consumers;

import java.util.function.Consumer;

public class Comsumers {
    public static void main(String[]  args){
        Consumer<String> consumer= (s)->System.out.println(s);
        consumer.accept("hello");
    }
}
