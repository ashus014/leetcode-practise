package src.ashu.arrayOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem13 {

    public static void main(String[] args) {

//        Write a program to check if a number is even/odd without using binary operations (%, /)

        // isOdd = TRUE
        // for(int i = 2; i<=num; i++) {
        // isOdd = !isOdd;

        //}

        //
        // input : aaabbcdeeehiih
        //	output : abcdehih
        // aab

        removeAdjacentDuplicates("aaabbcdeeehiih");
//
//        Merge 2 sorted array using java 8
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};


        IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();
    }


    private static void removeAdjacentDuplicates(String str) {

        StringBuilder sb = new StringBuilder();

        int i = 0, j =1;
        sb.append(str.charAt(0));
        while(j < str.length()) {
            if(str.charAt(i) != str.charAt(j)) {
                sb.append(str.charAt(j));
                i = j;
            }
            j++;
        }
        System.out.println(sb);
    }


}
