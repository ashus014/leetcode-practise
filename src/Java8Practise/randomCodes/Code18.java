package src.Java8Practise.randomCodes;

import java.util.Arrays;

public class Code18 {

    public static void main(String[] args) {

        String str = "ascvf123";
        System.out.println(filterNumberLength(str));
    }

    private static int filterNumberLength(String str) {
//        return str.replaceAll("[^0-9]", "").length();
//        String[] words = str.split(""); // split the input string by non-digit characters
//        System.out.println(Arrays.toString(words));
//        return Arrays.stream(words) // create a stream of words
//                .filter(word -> !word.isEmpty()) // filter out empty strings
//                .mapToInt(String::length) // map each word to its length
//                .sum(); // return the sum of all lengths
        int result = 0;
        char[] eachChar = str.toCharArray();

        for(char c : eachChar) {
            if((int)c >= 48 && (int)c <= 57)
                    result++;
        }
        return result;
    }
}
