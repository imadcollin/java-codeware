package codewar.flatmaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args){

        Employee p1= new Employee("A", 22);
        Employee p2 = new Employee("B", 33);
        Employee p3 = new Employee("C",44);

        Departments d1 = new Departments("HR");
        Departments d2= new Departments("Finance");

        d1.addEmployee(p1);
        d1.addEmployee(p2);

        d2.addEmployee(p3);

        //d1.getEmployees().stream().forEach(System.out::println);

        // All Departments
        List<Departments> departments= new ArrayList<>();
        departments.add(d1);
        departments.add(d2);

        //Print the name of the employees in all departments
        departments.stream().flatMap(x->x.getEmployees().stream()).forEach(System.out::println);

        //Group by age
        Map<Integer,List<Employee>> listMap=  departments.stream().flatMap(x->x.getEmployees().stream()).collect(Collectors.groupingBy(Employee::getAge));

        //Get the String name by age
        departments.stream().flatMap(x->x.getEmployees().stream()).reduce((a,b) -> a.getAge() < b.getAge()? a:b).ifPresent(System.out::println);
    }
}
