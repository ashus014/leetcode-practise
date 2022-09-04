package src.leetCodeProblems;

import java.util.Arrays;

public class Problem41 {
    
    public static void main(String[] args) {
        
        int[] num = {13,4,5};
        int ans = firstMissingPositive(num);
        System.out.println(ans);
    }

    static public int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0; i<nums.length; i++) {
            if(nums[i]-1 != i) {
                return i+1;
            }
        }
        return nums.length+1;
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] -1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int firstNumberIndex, int secondNumberIndex) {
        int temp = arr[firstNumberIndex];
        arr[firstNumberIndex] = arr[secondNumberIndex];
        arr[secondNumberIndex] = temp;
    } 
}
