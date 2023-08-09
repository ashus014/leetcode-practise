package src.ashu.test2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {
//
//        Input - [1,0,2,0,5,0,0,3]
//        Output - [1,2,5,3,0,0,0,0]

        int[] arr = {1,0,2,0,5,0,0,3};
        System.out.println(orderIntegers(arr));
    }

    public static List<Integer> orderIntegers(int[] arr) {

        List<Integer> result = new ArrayList<>();

        for(int i=0; i< arr.length; i++) {
            if(arr[i] != 0) {
                result.add(arr[i]);
            }
        }

        for(int i=  result.size();i< arr.length; i++ ) {
            result.add(0);
        }

        return result;
    }
}
