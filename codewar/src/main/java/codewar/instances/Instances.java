package codewar.instances;

import java.util.ArrayList;
import java.util.Scanner;

class Student{ }
class Rocker{}
class Hacker{}
public class Instances {
    static String count(ArrayList arrayList){
        int a=0, b=0, c=0;
        for (int i =0;i<arrayList.size();i++){
            if((arrayList.get(i) instanceof Student))
                a++;
            if(arrayList.get(i) instanceof Rocker) b++;
            if(arrayList.get(i) instanceof  Hacker) c++ ;
        }
        String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
        return ret;
    }
    public  static  void main (String []args) throws Exception {
        ArrayList arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Inputs");

        int t = scanner.nextInt();
        for (int i =0; i<t; i++){
            System.out.println("Enter the "+ i + " Object");

            String str = scanner.next();
            if(str.equals("Student")) arrayList.add(new Student());
            if(str.equals("Rocker")) arrayList.add(new Rocker());
            if(str.equals("Hacker"))arrayList.add(new Hacker());

        }
        System.out.println(count(arrayList));
    }
}
