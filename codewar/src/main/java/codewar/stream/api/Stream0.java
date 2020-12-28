package codewar.stream.api;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream0 {
    public static void  main(String[] args ){

        Stream<String> stream= Stream.of("abc","aaa","ava");
        System.out.println(stream.collect(Collectors.toList()));

        //Iterate
        Stream<Integer> integerStream= Stream.iterate(20, x->x+2).limit(10);
        System.out.println(integerStream.collect(Collectors.toList()));

        // IntStream
        IntStream intStream= IntStream.range(0,20);
        intStream.forEach(System.out::print);


    }
}
