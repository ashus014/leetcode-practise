package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem10_MergeSort {

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        // First Pointer
        int left = low;

        // second pointer
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // If anything left in left side add those
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // If anything left in right side add those
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
