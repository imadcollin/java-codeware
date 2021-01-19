package codewar.loops;

import java.util.Scanner;

public class Loop1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = 2;
        if (N > 1 && N <= 20)
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + N * i);
            }
        else {
            System.out.println("provide N >2 and N<= 20");
        }
    }
}
