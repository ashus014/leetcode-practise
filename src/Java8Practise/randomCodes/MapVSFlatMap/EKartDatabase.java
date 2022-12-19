package src.Java8Practise.randomCodes.MapVSFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDatabase {

    public static List<Customer> getAll() {

        return Stream.of(
                new Customer(101, "Ashu", "ashu@singh.com", Arrays.asList("1234", "5678")),
                new Customer(102, "Akash", "akash@singh.com", Arrays.asList("9101", "1121")))
                .collect(Collectors.toList());
    }
}
