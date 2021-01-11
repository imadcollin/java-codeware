package stream.consumers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, 12, "bob", "male");
        Student s2 = new Student(2, 22, "moa", "female");
        Student s3 = new Student(3, 18, "kent", "male");

        List<Student> students = new ArrayList<>(Arrays.asList(s1, s2, s3));

        System.out.println(students.size());

        Consumer<Student> studentConsumer= System.out::println;
        students.forEach(studentConsumer);
    }


}
