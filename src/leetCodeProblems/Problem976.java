package src.leetCodeProblems;

import java.util.Arrays;

public class Problem976 {
    
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        System.out.println(largestPerimeter(arr));
    }

    static public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for(int i = nums.length - 1; i > 1; i--) {
            if(nums[i] < nums[i-1] + nums[i-2])
                return nums[i] + nums[i-1] + nums[i-2];
        }

        return 0;
    }
}
