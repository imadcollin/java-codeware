package codewar.easy;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args){



        calls();
    }
    public  static  void statments(){
            /*
        Given an integer, , perform the following conditional actions:
            If  is odd, print Weird
            If  is even and in the inclusive range of  to , print Not Weird
            If  is even and in the inclusive range of  to , print Weird
            If  is even and greater than , print Not Weird
         */
        Scanner scanner= new Scanner(System.in);
        int N = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N%2!=0) System.out.println("Weird");
        else if (N% 2 == 0  &&  (N>= 2) && (N <=5))  System.out.println("Not Weird");
        else if (N% 2==0 && (N>=6) && (N<=20)) System.out.println("Weird");
        else if (N %2 ==0 && (N > 20 ))System.out.println("Not Weird");
        scanner.close();
    }

    public static void calls(){
        Scanner scan = new Scanner(System.in);
        String s= scan.next();
        double d= scan.nextDouble();
        int i = scan.nextInt();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
