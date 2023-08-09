package src.ashu.arrayOperations;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOperations {

    public static void main(String[] args) {

        // Find second-largest element in the list
        List<Integer> arr = Arrays.asList(5,3,7,8,2);
        System.out.println(arr.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0));

        // What we get the Array consisting of repeating elements
        List<Integer> arr2 = Arrays.asList(5,3,7,8,2,2);
        System.out.println(arr2.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(0));

        // out of two arrays find common
        // elements between them
        List<Integer> arr3 = Arrays.asList(1,2,3,4,5);
        List<Integer> arr4 = Arrays.asList(4,5,6,7,8);

        Set<Integer> collect = arr3.stream()
                .filter(
                        number -> arr4.stream()
                        .anyMatch(arr4Number -> arr4Number == number)
                )
                .collect(Collectors.toSet());
        System.out.println(collect);

        // reverse array integers in-place
        int[] arr5 = {1,2,3,4,5};
        IntStream.range(0, arr5.length/2).forEach(i -> {
            int temp = arr5[i];
            arr5[i] = arr5[arr5.length - i - 1];
            arr5[arr5.length - i - 1] = temp;
        });
        System.out.println(Arrays.toString(arr5));

        // Length of the longest string
        List<String> arr6 = Arrays.asList("Ashu", "Akash", "Anukriti");
        String as = arr6.stream()
                .collect(Collectors.maxBy(Comparator.comparing(e -> e.length())))
                .orElse("as");
        System.out.println(as);
    }
}
