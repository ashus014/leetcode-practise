package src.interviewPractise.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        System.out.println(subSetSum(arr));

    }

    public static List<List<Integer>> subSetSum(int[] arr) {

        List<List<Integer>> possibleCombo = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        helper(0,ds,arr, arr.length, possibleCombo);
        return possibleCombo;
    }

    private static void helper(int ind, List<Integer> ds, int[] arr, int len, List<List<Integer>> possibleCombo) {

        if(ind == len) {
            possibleCombo.add(new ArrayList<>(ds));
            return;
        }

        ds.add(arr[ind]);
        helper(ind + 1, ds, arr, len, possibleCombo);
        ds.remove(ds.size() - 1);
        helper(ind + 1, ds, arr, len, possibleCombo);

    }

}
