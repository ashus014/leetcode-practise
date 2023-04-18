package src.leetCodeProblems;

import java.util.*;
import java.util.Arrays;

public class Problem31 {

    public static void main(String[] args) {

        nextPermutation(new int[]{1,2,3});
    }


    public static void nextPermutation(int[] nums) {
        int index = Integer.MIN_VALUE;
        int n = nums.length;
        boolean solutionFound = false;

        for(int i=n-2; i >=0; i--) {
            if (nums[i] < nums[i+1]) {
                index = i;
                break;
            }
        }

        // reverse the arrays code
        if(index == Integer.MIN_VALUE) {
            int temp;
            for (int i = 0; i < nums.length / 2; i++) {
                temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }

            solutionFound = true;
        }

        // swap the min highest to index position
        if(!solutionFound) {
            for(int i=n-1; i>index; i--) {
                if(nums[i] > nums[index]) {
                    swap(nums, i, index);
                    break;
                }
            }

            reverse(nums, index + 1);
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void reverse(int[] arr, int start) {
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
