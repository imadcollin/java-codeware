package questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingbyName {
    public static void main(String args[]) {

        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee("John", 26);
        Employee emp2 = new Employee("Martin", 23);
        Employee emp3 = new Employee("John", 20);
        Employee emp4 = new Employee("Martin", 19);
        Employee emp5 = new Employee("Arpit", 27);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        System.out.println("List before sorting : ");
        employees = Employee.sorting(employees);
        Employee.print(employees);

        // Sort by names
        System.out.println("List by names : ");

        employees = Employee.sorting(employees);
        Employee.print(employees);

        // Sort by age
        System.out.println("List by ages : ");

        employees = Employee.sorting2(employees);
        Employee.print(employees);

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

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<Employee> sorting(List<Employee> list) {
        Collections.sort(list, Comparator.comparing(Employee::getName));
        return list;
    }

    public static List<Employee> sorting2(List<Employee> list) {
        return list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
    }

    public static void print(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee.name + " - " + employee.age);
        }
    }
}
