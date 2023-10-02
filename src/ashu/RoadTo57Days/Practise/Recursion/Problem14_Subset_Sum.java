package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Problem14_Subset_Sum {

    public static void main(String[] args) {
        int[] arr = {2, 3};
        System.out.println(subsetSums(arr, arr.length));
    }

    private static ArrayList<Integer> subsetSums(int[] arr, int N) {
        ArrayList<Integer> sumSubSet = new ArrayList<>();
        func(0, 0, arr, N, sumSubSet);
        Collections.sort(sumSubSet);
        return sumSubSet;
    }

    private static void func(int ind, int sum, int[] arr, int N, ArrayList<Integer> sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }
        //pick the element
        func(ind + 1, sum + arr[ind], arr, N, sumSubset);
        // do not pick the element
        func(ind + 1, sum, arr, N, sumSubset);
    }
}
