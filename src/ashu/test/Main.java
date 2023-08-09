package src.ashu.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {

        String strSentence = " Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";
        String[] split = strSentence.split(" ");

        Map<String, Long> collect = Arrays.stream(split)
                .map(str -> str.toLowerCase())
                .collect(Collectors.groupingBy(str1 -> str1, Collectors.counting()));

        System.out.println(collect);

        //System.out.println(Arrays.toString(split));
    }
}
