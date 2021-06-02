package codewar.cody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingV {
    public static void main(String[] args) {
        int num1 = missing(3, new int[] { 4, 9, 8, 2, 6 });
        int num2 = missing(5, new int[] { 5, 6, 4, 3, 2 });
        int num3 = missing(1, new int[] { 7, 7, 7, 7, 7, 7 });
        int num4 = missing(2, new int[] { 111111 });
        int num5 = missing(3, new int[] { 2, 3, 3, 5, 5 });
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
    }

    public static int missing(int K, int A[]) {
        int sum = 0;
        if (A.length == 0 || K < 1 || K > A.length || ! containEven(A))
            return -1;

            List<Integer> list = new ArrayList<Integer>();
            List<Integer> list2 = new ArrayList<Integer>();
            for (int i = 0; i < A.length; i++) {
                list.add(A[i]);
            }
            Collections.sort(list);

            if (K >= list.size()) {
                for (int i = 0; i < list.size(); i++)
                    sum += list.get(i);
                return sum;
            }
            list2 = new ArrayList<Integer>(list);
            list.removeIf(i -> i % 2 != 0);

            for (Integer integer : list) {
                if (integer % 2 != 0)
                    list.remove(integer);
            }

            if (K < list.size()) {
                for (int i = 0; i < K; i++)
                    sum += list.get(list.size() - i - 1);
                return sum;
            }

            if (K > list.size()) {
                int evens = list.size();
                int odds = K - evens;

                list2.removeIf(i -> i % 2 == 0);
                for (int i = 0; i < evens; i++)
                    sum += list.get(list.size() - i - 1);

                for (int i = 0; i < odds; i++)
                    sum += list2.get(list2.size() - i - 1);
                return sum;
            }
        return sum; 
        
    }

    public static boolean containEven(int A[]) {
        int count = 0;
        for (int i : A) {
            if (i % 2 == 0)
                count++;
        }
        return count > 0;
    }
}
