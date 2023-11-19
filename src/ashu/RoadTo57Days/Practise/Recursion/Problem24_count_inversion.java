package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Problem24_count_inversion {

//    private static int count  = 0;
    public static void main(String[] args) {

        int[] arr = {5,3,2,4,1};
//        System.out.println(findSolutionBruteForceApproach(arr));
        System.out.println(numberOfInversions(arr));
    }

    // Brute Force Approach
    private static int findSolutionBruteForceApproach(int[] arr) {

        int result = 0;
        if(arr.length < 3)
            return 0;

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    result++;
                    System.out.println(arr[i] + " & " + arr[j]);
                }
            }
        }
        System.out.println("+++++++++");
        return result;
    }

    // Optimal Approach

    private static int numberOfInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid); // left half
        count += mergeSort(arr, mid + 1, high); // right half
        count += merge(arr, low, mid, high); // merging sorted halves
        return count;
    }

    private static int merge(int[] arr, int low, int mid, int high) {

        List<Integer> temp = new ArrayList<>();
        // First Pointer
        int left = low;

        // second pointer
        int right = mid + 1;

        // keeping a count varibale
        int count = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            // right is smaller
            else {
                temp.add(arr[right]);
                // below line is the main logic
                count += (mid - left + 1);
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

        return count;
    }
}
