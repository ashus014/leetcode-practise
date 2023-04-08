package src.ashu;

import java.util.Arrays;
import java.util.List;

public class Random2 {

    public static void main(String[] args) {

        List<String> items = Arrays.asList(
                "ashu",
                "anu",
                "akash"
        );

        String notzhingFouNd = items.stream()
                .map(e -> e.toUpperCase())
                .findFirst().orElse("NOTZHING FOUNd");

        System.out.println(notzhingFouNd);

        System.out.println(items);
    }
}
