package codewar.cody;

public class FindPos {
    public static void main(String[] args) {
        System.out.println(solution( new int[] { 6, 42, 11, 7, 1, 42 },7));

    }
   public static  int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A[m] == X)
                return m;

            if (A[m] > X) {
                l = m;

            } else {
                l = m + 1;
            }
        }
        if (A[l] == X) {
            return l;
        }
        return -1;
    }
}
