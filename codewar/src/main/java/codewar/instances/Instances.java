package codewar.instances;

import java.util.ArrayList;
import java.util.Scanner;

class Student{ }
class Rocker{}
class Hacker{}
public class Instances {
    static String count(ArrayList arrayList){
        int a=0, b=0, c=0;
        for (Object o : arrayList) {
            if ((o instanceof Student))
                a++;
            if (o instanceof Rocker) b++;
            if (o instanceof Hacker) c++;
        }
        return  Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);

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
