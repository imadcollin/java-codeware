package codewar.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static  void main (String[] args ){
        List<String> strings = Arrays.asList("a1", "a2","a4", "a6", "A7", "a8", "a3" ,"b","a6");
 /*
        // Start with
        strings.stream().forEach(x-> {
            if(x.startsWith("a")) System.out.println(x);
        });


        // With filter  b is printed
        strings.stream().filter(x->x.startsWith("b")).forEach(System.out::println);

        //With toLowerCase A7 printed
         strings.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).forEach(System.out::println);

        //Sorted
        strings.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).sorted().forEach(System.out::println);
*/
        // Distinct
      int count= (int) strings.stream().distinct().count();
      System.out.println(count);
    }
}
