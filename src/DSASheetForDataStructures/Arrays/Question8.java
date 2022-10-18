package src.DSASheetForDataStructures.Arrays;

// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
public class Question8 {
    public static void main(String[] args) {
        int []arr = {1,2,3,-2,5};
        System.out.println(maxSubarraySum(arr, 9));
    }

    // Approach with time complexity O(n*n)
    // static private long maxSubarraySum(int a[], int n){
    //     long result = Long.MIN_VALUE, sum=0;

    //     for(int i=0; i<n; i++) {
    //         sum = 0;
    //         for(int j=i; j<n; j++) {
    //             sum += a[j];

    //             if(sum > result) {
    //                 result = sum;
    //             }
    //         }
    //     }

    //     return result;
    // }

    // Trying for O(n) solution
    static private long maxSubarraySum(int a[], int n) {
        int result = Integer.MIN_VALUE;
        int temp = 0;

        for(int i=0; i<a.length; i++) {

            temp += a[i];

            if(temp > result) {
                result = temp;
            }

            if(temp < 0) {
                temp = 0;
                result = 0;
            }
        }

        return result;
    }
}
