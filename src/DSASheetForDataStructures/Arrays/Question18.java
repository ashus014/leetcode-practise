package src.DSASheetForDataStructures.Arrays;

// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
// Given an array of N integers, and an integer K, 
// find the number of pairs of elements in the array whose sum is equal to K.

public class Question18 {

    public static int result;

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, 1 };
        int n = 4;
        int k = 6;
        System.out.println(getPairsCount(arr, n, k));
    }

    private static int getPairsCount(int[] arr, int n, int k) {
        return helper(arr, n, k, 2);
    }

    private static int helper(int[] arr, int n, int k, int pair) {

        if (k == 0 && pair == 0)
            return 1;
        if (pair == 0)
            return 0;
        if (n == 0 || k < 0)
            return 0;

        return helper(arr, n - 1, k - arr[n - 1], pair - 1) + helper(arr, n - 1, k, pair);
    }

}
