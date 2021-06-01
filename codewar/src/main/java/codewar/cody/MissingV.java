package codewar.cody;

public class MissingV {
    public static void main(String[] args) {
        int num = missing(new int[] { 1, 2, 3, 4, 5, 7 });
        System.out.println(num);

    }

    public static int missing(int arr[]) {
        if (arr.length == 0)
            return 0;

        int temp = arr[0];
        for (int x : arr) {
            if (x != temp)
                return temp;
            temp++;
        }

        return 0;
    }
}
