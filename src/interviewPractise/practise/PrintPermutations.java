package src.interviewPractise.practise;

import java.util.ArrayList;
import java.util.List;

public class PrintPermutations {

    public static void main(String[] args) {


        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }

    private static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums, ds, result, freq);
        return result;
    }

    private static void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {

        if(ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0; i< nums.length; i++) {
            if(!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds, ans, freq);
                freq[i] = false;
                ds.remove(ds.size() - 1);
            }
        }
    }

}
