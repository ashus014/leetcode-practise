package src.DSASheetForDataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1

// The cost of stock on each day is given in an array A[] of size N. 
// Find all the segments of days on which you buy and sell the stock so that in between those days your profit is maximum.

public class Question17 {

    private static final int MAX_VALUE = Integer.MAX_VALUE;

    public static void main(String[] args) {
        // int[] arr = { 100, 180, 260, 310, 40, 535, 695 };
        int[] arr = { 4, 2, 2, 2, 4, 2 };
        System.out.println(stockBuySell(arr, arr.length));
    }

    // Function to find the days of buying and selling stock for max profit.
    public static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {

        ArrayList<ArrayList<Integer>> resulList = new ArrayList<>();
        int high = -1;
        int low = MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            if (A[i] < low) {
                low = A[i];
                continue;
            }
            if (A[i] > A[i + 1]) {
                high = A[i];
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(low);
                temp.add(high);
                resulList.add(temp);
                low = MAX_VALUE;
            }
        }

        return resulList;
    }
}

// One answer from Geek For Geeks
// class Solution {
// // Function to find the days of buying and selling stock for max profit.
// ArrayList<ArrayList<Integer>> stockBuySell(int arr[], int n) {

// ArrayList<ArrayList<Integer>> pairs = new ArrayList<ArrayList<Integer>>();

// int[] buy = new int[n / 2];
// int[] sell = new int[n / 2];

// int k = 0;
// int j = 0;

// if (arr[0] < arr[1]) {
// buy[k] = 0;
// k++;
// }

// for (int i = 1; i < n - 1; i++) {
// if ((arr[i] < arr[i + 1]) && (arr[i] <= arr[i - 1])) {
// buy[k] = i;
// k++;
// }
// if ((arr[i] >= arr[i + 1]) && (arr[i] > arr[i - 1])) {
// sell[j] = i;
// j++;
// }
// }
// if (arr[n - 1] >= arr[n - 2]) {
// sell[j] = n - 1;
// j++;
// }

// if (k == j) {
// for (int i = 0; i < k; i++) {
// ArrayList<Integer> temp = new ArrayList<Integer>(2);
// temp.add(0, buy[i]);
// temp.add(1, sell[i]);
// pairs.add(temp);
// }

// }
// return pairs;
// }
// }