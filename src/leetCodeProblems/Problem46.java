package src.leetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class Problem46 {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
    }

    private static void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
        if(index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for(int i=0; i<nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index; i<nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index+1, nums, ans);
            swap(i, index, nums);
        }
    }

    private static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        recurPermute(0, nums, ans);
        return ans;
    }
}
