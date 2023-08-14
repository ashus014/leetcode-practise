package src.ashu.RoadTo57LPA.Day9_Recursion;

//        Problem Statement: Given an array of integers that may contain duplicates the
//        task is to return all possible subsets. Return only unique subsets and they can be in any order.

//        Example 1:
//
//        Input: array[] = [1,2,2]
//
//        Output: [ [ ],[1],[1,2],[1,2,2],[2],[2,2] ]
//
//        Explanation: We can have subsets ranging from  length 0 to 3. which are listed above.
//        Also the subset [1,2] appears twice but is printed only once as we require only unique subsets.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2_PrintAllTheUniqueSubsets {

    public static void main(String[] args) {
        int nums[] = {1, 2, 2};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }

    public static void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));
        for (int i = ind; i < nums.length; i++) {
            if (i != ind && nums[i] == nums[i - 1])
                continue;
            ds.add(nums[i]);
            findSubsets(i + 1, nums, ds, ansList);
            ds.remove(ds.size() - 1);
        }

    }
}
