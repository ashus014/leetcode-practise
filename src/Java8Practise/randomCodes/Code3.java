package src.Java8Practise.randomCodes;

import java.util.stream.IntStream;

public class Code3 {

    public static void main(String[] args) {

        IntStream.range(1, 11).forEach(System.out::println);
    }
}
