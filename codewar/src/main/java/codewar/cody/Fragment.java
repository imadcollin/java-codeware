package codewar.cody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fragment {
    public static void main(String[] args) {
        System.out.println(fra(7, 42, new int[] { 6, 42, 11, 7, 1, 42 }));
        System.out.println(fra2(7, 42, new int[] { 6, 42, 11, 7, 1, 42 }));
        System.out.println(fra(7, 42, new int[] { 7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7 }));
        System.out.println(fra2(7, 42, new int[] { 7, 42, 5, 6, 42, 8, 7, 5, 3, 6, 7 }));
    }

    public static int fra(int x, int y, int arr[]) {
        int x_l = 0;
        int count_x = 0;
        int count_y = 0;
        if (arr.length == 0)
            return -1;
        if (x == y)
            return 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                count_x++;
            if (arr[i] == y)
                count_y++;
            if (count_x == count_y)
                x_l = i;
        }
        return x_l;
    }

    public static int fra2(int x, int y, int arr[]) {

        if (arr.length == 0)
            return -1;
        if (x == y)
            return 1;
        List<Integer> xList = new ArrayList<Integer>();
        List<Integer> yList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                xList.add(i);
            if (arr[i] == y)
                yList.add(i);
        }

        if (xList.size() > yList.size()) {
            int larger_x = Collections.max(xList);
            return larger_x - 1;
        }
        if (xList.size() < yList.size()) {
            {
                int larger_y = Collections.max(yList);
                return larger_y - 1;
            }
        }
        return -1;
    }
}
