package dataStru;

import java.util.Arrays;

import javax.lang.model.element.Element;

public class MyArrayList<E> {
    public static int size = 0;
    public static final int CAP = 0;
    public static Object element[];

    public MyArrayList() {
        element = new Object[CAP];
    }

    public  void add(E obj){
if (size==0) increaseSize()
        element[size++]= obj; 
    }

    public static void increaseSize() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

}
