package stream.predicate;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, 12, "bob");
        Student s2 = new Student(2, 22, "moa");
        Student s3 = new Student(3, 18, "kent");

        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3));

        System.out.println(students.size());

        Predicate<Student> predicate = i -> i.getName().equals("bob");
        System.out.println(predicate.test(s1));

        Predicate<Student> agesSort= (stude) ->stude.getAge()>15; 
        studentsSort(students, agesSort);

    }

    public static void studentsSort(List<Student> list,  Predicate predicate ){
        list.stream().filter(predicate).forEach(System.out::println);
    }
}
