package src.interviews.walmart_senior_software.set_1;

import java.util.Arrays;

public class Round1_Problem1 {

    public static void main(String[] args) {

        int [] arr = {-1,-1,6,1,9,3,2,-1,4,-1};

        int [] result = new int[arr.length];
        Arrays.fill(result, -1);

        for (int j : arr) {
            if (j != -1) {
                result[j] = j;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
