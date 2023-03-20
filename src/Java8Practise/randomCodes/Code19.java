package src.Java8Practise.randomCodes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code19 {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);

//        map.forEach((key, value) -> System.out.println(key + " -> " + value));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        List<String> list2 = List.of("Ashu", "Singh");

        Integer reduce = list2.stream()
                .filter(e -> e.length() >= 4)
                .map(String::length)
                .reduce(0, (e, sum) -> sum += e);

        System.out.println(reduce);

//        list.stream().
//                forEach(System.out::println);
    }
}
