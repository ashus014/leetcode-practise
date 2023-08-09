package src.ashu.ibm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Random002 {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Ashu", 28, 2280000L, "Automobile");
        Employee emp2 = new Employee("Akash", 23, 1500000L, "Mechanical");
        Employee emp3 = new Employee("Anukriti", 18, 500000L, "Chemical");
        Employee emp4 = new Employee("Khushi", 17, 1500000L, "Metallurgy");
        Employee emp5 = new Employee("Muskaan", 17, 50000000L, "Computer");


        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);

        // filter all employees whose age is greater than 18
        List<Employee> ageGreaterThan18 = list.stream()
                .filter(e -> e.getAge() > 18)
                .collect(Collectors.toList());

        // group by employees by the department
        Map<String, Set<Employee>> collect = list.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.toSet()));

        System.out.println(collect);
    }
}
