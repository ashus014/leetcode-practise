package src.ashu;

import java.util.Arrays;
import java.util.List;

public class WorkingWithParallel {

    public static int transform(int number) {
        sleep(1000);
        return number * 1;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        numbers.stream()
//                .parallel()
//                .map(e -> transform(e))
//                .sequential()
//                .forEach(System.out::println);


//        System.out.println(
//                numbers.stream()
//                        .parallel()
//                        .reduce(0, (total, e) -> add(total, e))
//        );

        // first number greater than 5
        System.out.println(
                numbers.stream()
                        .filter(e -> e > 5)
                        .mapToInt( e -> e)
                        .findFirst()
                        .orElse(0)
        );
    }

    public static int add(int a, int b) {
        return a + b;
    }

    private static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }
}
