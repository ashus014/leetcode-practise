package src.Java8Practise.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {

    public static final String[] VALUES = new String[] { "AB", "BC", "CD", "AE" };

    public static void main(String[] args) {

        // System.out.println(Arrays.stream(VALUES).anyMatch("AE"::equals));

        List<String> strings = List.of("Ashu", "Akash", "Anu", "Aditya", "Aman");
        strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .skip(2)
                .limit(3)
                .forEach(x -> System.out.println(x));

    }
}
