package src.ashu.arrayOperations;

import java.util.Arrays;
import java.util.List;

public class Problem10 {



    public static void main(String[] args) {



        List<Integer> arr = List.of(11, 33, 134, 23, 56, 78, 79, 17);
        System.out.println(findMaxElement(arr));
    }

    private static int  findMaxElement(List<Integer> arr) {

        int MAX_ELEMENT = Integer.MIN_VALUE;

        for(int i=0; i< arr.size(); i++) {
            if(arr.get(i) > MAX_ELEMENT)
                MAX_ELEMENT = arr.get(i);
        }
        return MAX_ELEMENT;
    }
}
