package src.DSASheetForDataStructures.Arrays;

// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
public class Question13 {
    
    public static void main(String[] args) {
        

        int[] arr = {-1, -2 ,-3 ,-4};
        System.out.println(maxSubarraySum(arr, arr.length));
    }

    static long maxSubarraySum(int a[], int n){
        
        long temp = 0;
        long sumTillNow = Long.MIN_VALUE;

        for(int num : a) {
            temp += num;

            if(sumTillNow < temp) {
                sumTillNow = temp;
            }

            if(temp < 0) {
                temp = 0;
            }
        }

        return sumTillNow;
    }
}
