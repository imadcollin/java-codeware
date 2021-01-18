package codewar.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(44);
        list2.add(55); 
        list.addAll(list2);

        printList(list);

        list.addAll(1, list2); 
        printList(list);
    }

    public static void printList(List<Integer> list) {
        list.stream().forEach(System.out::println);
    }
}
