package src.ashu.ibm;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorsTutorial {

    public static void main(String[] args) {

        List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

        //The toList collector can be used for collecting all Stream elements into a List instance.
//        List<String> result = givenList.stream()
//                .collect(Collectors.toList());


        //Java 10 introduced a convenient way to accumulate the Stream elements into an unmodifiable List
//        List<String> result2 = givenList.stream()
//                .collect(Collectors.toUnmodifiableList());
//        result2.add("ashu");

//        System.out.println(givenList.size());
//
//        Set<String> result = givenList.stream()
//                .collect(toSet());
//
//        System.out.println(result.size());


        //Function.identity() is just a shortcut for defining a function that accepts and returns the same value.
//        Map<String, Integer> result = givenList.stream()
//                .collect(toMap(Function.identity(), String::length));
//        //.collect(toMap( e -> e, String::length)); // both way is fine
//
//        result.forEach((k,v) -> System.out.println(k + " -> " + v));


        //Collectors.collectingAndThen()
//        List<String> result = givenList.stream()
//                .collect(collectingAndThen(toList(), ImmutableList::copyOf));


        // Collectors.joining()
//        String result = givenList.stream()
//                .collect(joining());
//
//        System.out.println(result);



        //MaxBy/MinBy collectors return the biggest/smallest element
        // of a Stream according to a provided Comparator instance.

//        Optional<String> collectMax = givenList.stream()
//                .collect(maxBy(Comparator.naturalOrder()));
//
//        Optional<String> collectMin = givenList.stream()
//                .collect(minBy(Comparator.naturalOrder()));
//
//        System.out.println(collectMax);
//        System.out.println(collectMin);


        //GroupingBy collector is used for grouping objects
        // by some property, and then storing the results in a Map instance.
//        Map<Integer, Set<String>> collect = givenList.stream()
//                .collect(groupingBy(String::length, toSet()));
//
//        System.out.println(collect);

        //PartitioningBy is a specialized case of groupingBy that accepts a
        // Predicate instance, and then collects Stream elements into a Map
        // instance that stores Boolean values as keys and collections as values.

        Map<Boolean, List<String>> result = givenList.stream()
                .collect(partitioningBy(s -> s.length() > 2));

        System.out.println(result);


    }
}
