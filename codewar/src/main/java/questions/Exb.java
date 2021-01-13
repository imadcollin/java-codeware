package questions;

import java.util.HashSet;

public class Exb {
    public static void main(String[] args){
        Student s1= new Student(1,"Adam"); 
        Student s2= new Student(2,"Bob"); 

        HashSet hashSet= new HashSet<>(); 
        hashSet.add(s1);
        hashSet.add(s2);

        System.out.println(hashSet);
    }
}

class Student{
    private final int id; 
    private String name; 

    Student(int id , String name ){
        this.id=id; 
        this.name=name; 
    }
    public String toString(){
        return "Name: "+ name+ ", ID: "+ id; 
    }
}
