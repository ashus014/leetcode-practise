package src.ashu;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

//        Max occurances of an element in a list:
//  [1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3] // write a program using streams
        List<Integer> list = Arrays.asList(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3);
        System.out.println(maxOccurences(list));
    }

    public static int maxOccurences(List<Integer> list) {

        Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        return Integer.valueOf(Math.toIntExact(collect.values().stream()
                .max(Long::compare).orElse(0L)));
    }
}
