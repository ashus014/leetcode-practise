package src.ashu.RoadTo57Days.Day9_Recursion;

//        Problem Statement: Given an array print all the sum of the subset
//        generated from it, in the increasing order.

//        Example 1:
//
//        Input: N = 3, arr[] = {5,2,1}
//
//        Output: 0,1,2,3,5,6,7,8
//
//        Explanation: We have to find all the subset’s sum and print them.in this case the generated subsets
//        are [ [], [1], [2], [2,1], [5], [5,1], [5,2]. [5,2,1],so the sums we get will be  0,1,2,3,5,6,7,8
//
//        Example 2:
//        Input: N=3,arr[]= {3,1,2}
//
//        Output: 0,1,2,3,3,4,5,6
//
//        Explanation: We have to find all the subset’s sum and print them.in this case the generated subsets
//        are [ [], [1], [2], [2,1], [3], [3,1], [3,2]. [3,2,1],so the sums we get will be  0,1,2,3,3,4,5,6


import java.util.ArrayList;
import java.util.Collections;

public class Problem1_SubsetSum {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        int N = 3;
        System.out.println(subSetsSum(arr, N));
    }

    public static ArrayList<Integer> subSetsSum(ArrayList<Integer> array, int N) {
        ArrayList<Integer> subSets = new ArrayList<>();
        helper(0, 0, array, N, subSets);
        Collections.sort(subSets);
        return subSets;
    }

    static void helper(int index, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> subSets) {

        if(index == N) {
            subSets.add(sum);
            return;
        }

        // pick the element
        helper(index + 1, sum + arr.get(index), arr, N, subSets);

        // do not pick the element
        helper(index + 1, sum, arr, N, subSets);
    }
}
