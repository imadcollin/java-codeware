package codewar.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Techniques {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aaa","bbb", "Ccc","fff", "mmm", "ggg" );

        //  printList(capitalized(stringList));
        //  printList(sorted(capitalized(stringList)));
        allInOne(stringList);
    }

    static List<String> capitalized(List<String> stringList) {
        return stringList.stream().map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.toList());

    };

    static List<String> sorted(List<String> stringList){
        return stringList.stream().sorted().collect(Collectors.toList());
    }

    static void printList(List<String> stringList){
        stringList.stream().forEach(System.out::println);
    }

    /****************************************************/
    // All in one line
    static void allInOne(List<String> stringList){
        stringList.stream().map(x->x.substring(0,1).toUpperCase()+x.substring(1)).sorted(String::compareTo).forEach(System.out::println);
    }
}

