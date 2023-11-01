package src.interviewPractise.practise;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

    public static void main(String[] args) {


        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }

    private static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isSelected = new boolean[arr.length];
        helper(result, ds, isSelected, arr);
        return result;
    }

    private static void helper(List<List<Integer>> result,
                               List<Integer> ds,
                               boolean[] isSelected,
                               int[] arr) {

        if (ds.size() == arr.length) {
            result.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i< arr.length; i++) {
            if (!isSelected[i]) {
                isSelected[i] = true;
                ds.add(arr[i]);
                helper(result, ds, isSelected, arr);
                isSelected[i] = false;
                ds.remove(ds.size() - 1);
            }
        }

    }
}
