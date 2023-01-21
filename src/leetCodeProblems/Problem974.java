package src.leetCodeProblems;

public class Problem974 {

    // public static int result = 0;

    public static void main(String[] args) {
        int nums[] = { 4, 5, 0, -2, -3, 1 }, k = 5;
        System.out.println(subarraysDivByK(nums, k));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int result = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum % k == 0) {
                    result++;
                }
            }
            sum = 0;
        }
        return result;
    }

    // public static void helper(int[] nums, int n, int k, int sum, boolean doISkip)
    // {

    // if (n == 0) {
    // return;
    // }

    // if (!doISkip) {
    // sum += nums[n - 1];

    // if ( sum % k == 0) {
    // result++;
    // }
    // }

    // helper(nums, n - 1, k, sum, true);
    // helper(nums, n - 1, k, sum, false);
    // }
}
