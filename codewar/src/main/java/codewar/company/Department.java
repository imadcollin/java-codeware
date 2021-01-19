package codewar.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Department {
    private int id;
    private List<Employee> employees;

    public Department(int id) {
        this.id = id;
        employees = new ArrayList<>();
    }

    public List<Employee> getAllEmployees() {
        return this.employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public List<Employee> removeEmployee(String name) {
        return employees.stream().filter(x -> (!  name.equals(x.getName()))).collect(Collectors.toList());
    }
    public static List<Employee> sortEmp(List<Employee> list){
        return list.stream().sorted(Comparator.comparing(list,Employee::getName)).collect(Collectors.toList());
    }

}
