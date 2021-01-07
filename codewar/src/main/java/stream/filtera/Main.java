package stream.filtera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args){
        Student s1=new Student(1,12,"bob","male");
        Student s2=new Student(2,22,"moa","female");
        Student s3=new Student(3,18,"kent","male");

        List<Student> students=new ArrayList<>();
        students.addAll(Arrays.asList(s1,s2,s3));

        System.out.println(students.size());

        //Sorting..
        List<Student> sortedList= sortByGender(students);
        print(sortedList);

    }

    public static  List<Student> sortByGender(List<Student> list){
       return  list.stream().filter(student -> student.getGender().equals("male")).collect(Collectors.toList());
    }

    public static void print(List<Student> list){
        list.stream().forEach(System.out::println);
    }
}
