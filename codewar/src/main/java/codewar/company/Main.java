package codewar.company;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(20, "Alewx");
        Employee e2 = new Employee(25, "Erik");
        Employee e3 = new Employee(28, "Roume");

        Department tech = new Department(1);
        tech.addEmployee(e1);
        tech.addEmployee(e2);
        printList(tech.getAllEmployees());

        // Remove an Employee
        System.out.println("---------------------");
        printList(tech.removeEmployee("Erik"));

    }

    public static void printList(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println("Name: " + employee.getName() + " Age:" + employee.getAge());
        }
    }
}
