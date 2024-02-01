package src.interviews.epam;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = List.of(new Employee("Ashu", 12),
                new Employee("Akash", 12),
                new Employee("Anu", 13),
                new Employee("Aman", 14),
                new Employee("Aditya", 15),
                new Employee("Muskaan", 16),
                new Employee("Khushi", 16)
        );


        List<Employee> collect = list.stream()
                .sorted((e1, e2) -> {
                    if (e1.getAge() == e2.getAge()) {
                        return e1.name.compareTo(e2.getName());
                    } else {
                        return e1.getAge() - e2.getAge();
                    }
                }).collect(Collectors.toList());

        System.out.println(collect);

    }
}
