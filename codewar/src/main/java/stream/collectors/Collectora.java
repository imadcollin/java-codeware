package stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectora {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
        // myList.stream().forEach(System.out::print);

        long count = myList.stream().count();
        System.out.println(count);

        int avg = myList.stream().collect(Collectors.summingInt(a -> a));
        System.out.println(avg);

        //Sum
        int sum = myList.stream().collect(Collectors.summingInt(v -> v));
        System.out.println(sum);
    }
}

