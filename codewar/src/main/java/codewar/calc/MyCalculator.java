package codewar.calc;

import java.util.Scanner;

interface AdvancedArithmetic{
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){ //6 1 ,2 ,3 ,6  // 20 10 5 4 1
        int res=0;
        for (int i=1; i<n; i++){
            if (n%i==0){
               res+= i  ;
            }
        }
        return res;
    }
}

class Solution{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(20) + "\n");
        sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }
}