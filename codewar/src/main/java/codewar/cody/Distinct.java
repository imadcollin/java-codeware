package codewar.cody;

public class Distinct {
    public static void main(String[] args) {
        int num = distinct(new int[] { 1, 2, 2, 1, 3, 4, 4 });
        System.out.println(num);
    }

    public static int distinct(int arr[]) {

        if (arr.length == 0)
            return 0;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == val) {
                    count++;
                }

            }
            if (count < 2)
                return arr[i];
        }
        return 0;
    }
}
