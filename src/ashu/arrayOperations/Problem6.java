package src.ashu.arrayOperations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem6 {


    public static void main(String[] args) {

        // Students
        // Name -> StudentName
        // StudentGrade -> KG....Sixth Std


        List<Student> studentList = Arrays.asList(new Student("Student1", "KG"),
                new Student("Student2", "First"),
                new Student("Student3", "KG"));


        Map<String, List<Student>> collect = studentList.stream()
                .collect(Collectors.groupingBy(Student::getStudentGrade));


        System.out.println(collect);
    }
}
