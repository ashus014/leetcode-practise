package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem15_Subset_Sum_2 {

    public static void main(String[] args) {

        int[] candidates = {1, 2, 2};
        int target = 9;
        System.out.println(subsetsWithDups(candidates));
    }

    private static List<List<Integer>> subsetsWithDups(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }

    private static void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));
        for (int i = ind; i< nums.length; i++) {
            if(i!=ind && nums[i] == nums[i-1])
                continue;
            ds.add(nums[i]);
            findSubsets(i+1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }
    }
}
