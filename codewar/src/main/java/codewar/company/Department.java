package codewar.company;

import java.util.ArrayList;
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

    public void removeEmployee(String name) {
        employees.stream().filter(x -> !(x.getName().equals(name))).collect(Collectors.toList());
    }

}
