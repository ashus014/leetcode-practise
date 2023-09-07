package src.ashu.test;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    static List<String> arr = Arrays.asList("maharashtra", "Tamil Nadu");
    static List<String> getAllStates() {
        return new ArrayList<>(arr);
    }
}

class Demo {
    public static void main(String[] args) {

//        List<String> allStates = Main.getAllStates();
//        allStates.add("UP");
//        System.out.println("allStates" +allStates);
//
//        List<String> allStates2 = Main.getAllStates();
//        System.out.println("allStates2" + allStates2);
//        allStates2.clear();
//        System.out.println("allStates2" + allStates2);
//        System.out.println("allStates" + allStates);


        List<Integer> arr1 = Arrays.asList(1,2,3,4,5);
        List<Integer> arr2 = Arrays.asList(2,3,4,5,6);
        arr1.addAll(arr2);
        arr1.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
                .forEach( e -> System.out.println(e.getValue()));


        //unkonwn no. of lines in a file -> read last 3 lines

        // first challenge - find no. of line sin a file

        //100

//        i=2;
//        4, 8, 16, 32, 64,
//                128 => out of bound exception
//        while(true) {
//            i *= 2;
//        }
//
//        i, j
//        i=1 j=i*1;                                                        //diff = 1;
//        i=j j=i*2;
//        BufferedReader br = new BufferedReader("abc.txt");
//        br.readLine();
//
//        String s1 = "hello" + "world";
//        // s1 -> "helloworld"
    }
}
