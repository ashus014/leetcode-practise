package src.Java8Practise.randomCodes;

import java.util.Arrays;
import java.util.stream.Stream;

public class Code2 {

    public static void main(String[] args) {
        Object[] array = { 1, 2, new Object[] { 3, 4, new Object[] { 5 }, 6, 7 }, 8, 9, 10 };
        Integer[] flattenArray = flatten(array);
        System.out.println(Arrays.toString(flattenArray));

    }

    public static Integer[] flatten(Object[] inputArray) {

        Object[] temp = flattenStream(inputArray).toArray();
        Integer[] result = Arrays.copyOf(temp, temp.length, Integer[].class);
        return result;
    }

    public static Stream<Object> flattenStream(Object[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(o -> o instanceof Object[] ? flattenStream((Object[]) o) : Stream.of(o));
    }

}
