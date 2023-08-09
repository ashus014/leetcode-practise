package src.ashu.ibm;

import java.util.ArrayList;
import java.util.List;

public class Random003 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int K = 3;
        findMaximumElementFromContigiousSubarrays(arr, K);
    }

    public static void findMaximumElementFromContigiousSubarrays(int[] arr, int K) {
        List<Integer> result = new ArrayList<>();
        int j = K - 1;
        for (int i = 0; j < arr.length; i++, j++) {
            result.add(findMax(arr, i, j));
        }
        System.out.println(result);
    }

    private static int findMax(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
