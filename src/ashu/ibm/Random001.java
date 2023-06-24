package src.ashu.ibm;

import java.util.*;
import java.util.stream.Collectors;

public class Random001 {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Ashu", 28, 2280000L, "Computer");
        Employee emp2 = new Employee("Akash", 23, 1500000L, "Mechanical");
        Employee emp3 = new Employee("Anukriti", 18, 500000L, "Chemical");
        Employee emp4 = new Employee("Khushi", 17, 1500000L, "Chemical");
        Employee emp5 = new Employee("Muskaan", 17, 50000000L, "Computer");


        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);


        Map<String, Optional<Long>> maxSalaryByDepartment = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary, Collectors.maxBy(Comparator.naturalOrder()))));

        maxSalaryByDepartment.forEach((k,v) -> System.out.println(k + " -> " + v));

        ////////////////////////////////////////////////////////////////////////

        Map<Integer, Employee> map = list.stream()
                .collect(Collectors.toMap(employee -> employee.getName().hashCode(), employee -> employee));

        map.forEach((k,v) -> System.out.println(k + " -> " + v));
    }
}
