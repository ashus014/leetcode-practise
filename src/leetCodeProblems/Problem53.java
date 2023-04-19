package src.leetCodeProblems;

public class Problem53 {

    public static void main(String[] args) {

        System.out.println(maxSubArray(new int[] {5,4,-1,7,8}));
    }

    public static int maxSubArray(int[] nums) {

        if(nums.length == 1)
            return nums[0];

        int sumSoFar = nums[0];
        int temp = sumSoFar;

        for(int i=1; i<nums.length; i++) {
            sumSoFar += nums[i];
            if(sumSoFar < nums[i] ) {
                sumSoFar = nums[i];
            }
            if(sumSoFar > temp) {
                temp = sumSoFar;
            }
        }
        return temp;
    }
}
