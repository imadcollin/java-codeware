package codewar.flatmaps;

import java.util.ArrayList;
import java.util.List;

public class Departments {
    private String name;
    private Employee employee;
    private List<Employee> employees;

    public Departments(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public List<Employee> getEmployees(){
        return employees;
    }

}


