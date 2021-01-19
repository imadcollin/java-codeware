package codewar.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter {
    public static void main(String[] args) {
        Employee e2 = new Employee(33, "moa", new Date(2020, 3, 12));
        Employee e1 = new Employee(22, "bob", new Date(1999, 3, 12));
        Employee e3 = new Employee(44, "adam", new Date(2020, 3, 12));
        Employee e4 = new Employee(11, "eva", new Date(2020, 3, 12));

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Employee.printList(list);
        System.out.println("---------------------");
        list = Employee.nameSort(list);
        Employee.printList(list);

        list.sort(new AgeSorting());

        System.out.println("---------------------");
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
        return name;
    }

    public int getAge() {
        return age;
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

class AgeSorting implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() > o2.getAge() ? 1 : o1.getAge() < o2.getAge() ? -1 : 0;
    }

}
