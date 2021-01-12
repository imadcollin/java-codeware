package codewar.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class EspecialStr {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("42");
        arrayList.add("###");
        arrayList.add("Hello");
        arrayList.add("Java");
        arrayList.add("4");
        Iterator iterable = arrayList.iterator();
        while (iterable.hasNext()) {
            if (iterable.next().toString() == "###") {
                while (iterable.hasNext()) {
                    System.out.println(iterable.next().toString());
                }
            }
        }
    }
}
