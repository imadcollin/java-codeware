package codewar.lambdas;

import java.util.*;

public class Employee {

    public static  void main(String[] args){
        Employee e1=new Employee(10,"Johan");
        Employee e2= new Employee(22, "Alice");
        Employee e3= new Employee( 14, "Bob");

        /**************************************************/
     /*   List<Employee> employeeList= new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        employeeList=sorting(employeeList);

        for (Employee employee: employeeList
        ) {
            System.out.println(employee.getAge());
        }
    */

        /************************ Lambda **************************/

        List<Employee> employeeList1= Arrays.asList(new Employee(10, "Johan"), new Employee(22, "Alice"),new Employee(14,"Bob"));

        // Collections
        //Collections.sort(employeeList1, Comparator.comparing(Employee::getName));

        employeeList1.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(x-> System.out.println(x.getName()+" \t"+ x.getAge()));
    }


    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    /********************** Sorting ****************************/

    public  static List<Employee> sorting(List<Employee> list){
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getAge()>o2.getAge()) return 1;
                else if(o1.getAge()==o2.getAge()) return 0;
                else return -1;
            }
        });
        return list;
    }

}
