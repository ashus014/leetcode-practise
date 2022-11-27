package src.DSASheetForDataStructures.SearhingAndSorting;

import java.util.Arrays;

// This is where we use 'Pivot'
// After first pass, all the elements less than pivot will be on left side of pivot
// And elemts greater than would be right side
// So after every pass, we are putting 'pivot' element at its correct position

// Merge sort usually takes a extra space during sorting - Better in terms of linkedlist
// Quick sort is not atable sorting algorithm
public class QuickSortQuestion {

    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 1 };
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quicksort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = nums[mid];

        while (start <= end) {
            while (nums[start] < pivot) {
                start++;
            }
            while (nums[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        quicksort(nums, low, end);
        quicksort(nums, start, high);
    }

}
