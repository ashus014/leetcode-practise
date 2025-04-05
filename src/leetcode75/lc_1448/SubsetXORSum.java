package src.leetcode75.lc_1448;

public class SubsetXORSum {

    public int subsetXORSum(int[] nums) {
        return dfs(nums, 0, 0);
    }

    private int dfs(int[] nums, int index, int currentXor) {
        if (index == nums.length) {
            return currentXor;
        }
        // Include current number
        int with = dfs(nums, index + 1, currentXor ^ nums[index]);
        // Exclude current number
        int without = dfs(nums, index + 1, currentXor);
        return with + without;
    }

    public static void main(String[] args) {
        SubsetXORSum obj = new SubsetXORSum();
        int[] nums = {5,1,6};
        System.out.println("Total XOR sum of all subsets: " + obj.subsetXORSum(nums));
    }

}
