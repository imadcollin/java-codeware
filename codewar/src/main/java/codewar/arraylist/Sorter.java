package codewar.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static void main(String[] args) {
        Employee e1 = new Employee(22, "bob", new Date(1999, 3, 12));
        Employee e2 = new Employee(33, "moa", new Date(2020, 3, 12));
        Employee e3 = new Employee(44, "adam", new Date(2020, 3, 12));

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

        Employee.printList(list);
        System.out.println("---------------------");
        list = Employee.nameSort(list);
        Employee.printList(list);

    }

}

class Employee {
    private int age;
    private String name;
    private Date date;

    public Employee(int age, String name, Date date) {
        super();
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Name is: " + name + " Age: " + age + " Date:" + date;
    }

    public static List<Employee> nameSort(List<Employee> list) {
        return list.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
    }

    public static void printList(List<Employee> list) {
        list.stream().forEach(System.out::println);
    }
}
