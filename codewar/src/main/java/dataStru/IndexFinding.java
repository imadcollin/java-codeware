package dataStru;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexFinding {
    public static Scanner scanner= new Scanner(System.in);
    public static void main (String []args){
        ArrayList<ArrayList<Integer>> parent = new ArrayList<>();
        // System.out.println("Enter No of Arrays");

        int arrs= scanner.nextInt();

        for (int i = 1; i <=arrs ; i++) {
            //  System.out.println("How many elements you want in the: "+ i + " Array?");

            int counts = scanner.nextInt();
            parent.add(generateArr(counts));

        }
        // System.out.println("Indicate the elements [row,el]");
        for (int i = 1; i <=arrs ; i++) {
            int row = scanner.nextInt();
            int el = scanner.nextInt();
            printArr(parent, row, el);
        }

    }
    static void printArr(ArrayList<ArrayList<Integer>> parent,  int row , int el){

        ArrayList<Integer> temp = parent.get(row-1);
        if(temp.size()<el-1) System.out.println("Error");
        else System.out.println(temp.get(el-1));
    }
    static ArrayList<Integer> generateArr(int num ){
        ArrayList<Integer> arrayList= new ArrayList<>();
        // Scanner scanner= new Scanner(System.in);
        //  System.out.println("Enter the digits");
        while (num>0) {
            int x = scanner.nextInt();
            arrayList.add(x);
            num --;
        }
        return arrayList;
    }
}
