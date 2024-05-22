package src.ashu.arrayOperations;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Pilot {

    public static void main(String[] args) {


        Integer[] arr = {1, 2, 3, 2, 5, 3, 0,0,5, 7, 9};
        printDuplicateElementsFromArray(arr);

    }

    private static void printDuplicateElementsFromArray(Integer[] arr) {

//        Map<Integer, Integer> result = new HashMap<>();
//
//        for (int j : arr) {
//            result.put(j, result.getOrDefault(j, 0) + 1);
//        }
//
//        for(Map.Entry<Integer, Integer> temp : result.entrySet()) {
//            if(temp.getValue() > 1)
//                System.out.println(temp.getKey());
//        }

        List<Integer> collect = Arrays.stream(arr)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .collect(Collectors.toList());


        System.out.println(collect);

    }
}
