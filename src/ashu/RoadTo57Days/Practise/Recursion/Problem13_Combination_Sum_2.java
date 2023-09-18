package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem13_Combination_Sum_2 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(combination(candidates, target));
    }

    private static List<List<Integer>> combination(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {

        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            // if the current element is same as prev element, skip that
            if (i > ind && arr[i] == arr[i - 1]) continue;
            // if current element is greater than target element, break
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
