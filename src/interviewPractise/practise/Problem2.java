package src.interviewPractise.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {

        int[] arr = {2,3};
        System.out.println(subSetSum(arr));

    }

    public static List<Integer> subSetSum(int[] arr) {

        List<Integer> sumSubSet = new ArrayList<>();
        helper(0,0,arr, arr.length, sumSubSet);
        Collections.sort(sumSubSet);
        return sumSubSet;
    }

    private static void helper(int ind, int sum, int[] arr, int len, List<Integer> sumSubSet) {

        if(ind == len) {
            sumSubSet.add(sum);
            return;
        }

        helper(ind + 1, sum + arr[ind], arr, len, sumSubSet);
        helper(ind + 1, sum, arr, len, sumSubSet);

    }

}
