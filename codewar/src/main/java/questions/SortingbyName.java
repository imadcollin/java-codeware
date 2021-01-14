package questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;

public class SortingbyName {
    public static void main(String args[]) {
    
        List<Employee> employees= new ArrayList<>(); 
        Employee emp1= new Employee("John",26);
        Employee emp2= new Employee("Martin",23);
        Employee emp3= new Employee("John",20);
        Employee emp4= new Employee("Martin",19);
        Employee emp5= new Employee("Arpit",27);
       
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        System.out.println("List before sorting : ");
        employees= Employee.sorting(employees); 
        for(Employee e: employees)
        {
         System.out.println(e.name+" - "+e.age);
        }
}
}

class Employee {
    public String name;
    public int age;
    
    public Employee(String name, int age) {
     super();
     this.name = name;
     this.age = age;
    }
    public String getName(){
        return name; 
    }
    public static List<Employee> sorting(List<Employee> list){
 Collections.sort(list, Comparator.comparing(Employee::getName));
 return list;
    }
}

