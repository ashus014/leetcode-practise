package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Problem12_Combination_Sum {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 9;
        System.out.println(combination(candidates, target));
    }

    private static List<List<Integer>> combination(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void findCombinations(int ind,
                                         int[] arr,
                                         int target,
                                         List<List<Integer>> ans,
                                         List<Integer> ds) {

        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }
}
