package src.Java8Practise.randomCodes;

import java.util.List;
import java.util.stream.IntStream;

public class Code15 {

    public static void main(String[] args) {

        // Code : 1
        long start = 0;
        long end = 0;
        // start = System.currentTimeMillis();
        // IntStream.range(1, 100)
        // .forEach(System.out::println);
        // end = System.currentTimeMillis();
        // System.out.println("Plain stream took time : " + (end - start));

        // // Code : 2
        // start = System.currentTimeMillis();
        // IntStream.range(1, 100)
        // .parallel()
        // .forEach(System.out::println);
        // end = System.currentTimeMillis();
        // System.out.println("Plain stream took time : " + (end - start));

        List<Employee> employees = EmployeeDatabase.getEmployees();

        // normal stream
        start = System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("salaryWithStream : " + salaryWithStream);
        System.out.println("Plain stream took time : " + (end - start));

        // parallel stream
        start = System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        end = System.currentTimeMillis();
        System.out.println("salaryWithParallelStream : " + salaryWithParallelStream);
        System.out.println("Parallel stream took time : " + (end - start));
    }
}
