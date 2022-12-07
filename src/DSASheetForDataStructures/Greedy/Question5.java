package src.DSASheetForDataStructures.Greedy;

import java.util.Arrays;

// Fractional Knapsack
// https://practice.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
public class Question5 {

    public static void main(String[] args) {

        Item[] arr = {
                new Item(60, 10),
                new Item(100, 20),
                new Item(120, 30) };

        int W = 50;
        System.out.println(fractionalKnapsack(W, arr, arr.length));
    }

    // Function to get the maximum total value in the knapsack.
    private static double fractionalKnapsack(int W, Item arr[], int n) {

        Arrays.sort(arr, (a, b) -> {
            return (a.weight * b.value) - (a.value * b.weight);
        });

        System.out.println(Arrays.toString(arr));

        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].weight <= W) {
                result += arr[i].value;
                W -= arr[i].weight;
            } else {
                result += arr[i].value * ((double) W / (double) arr[i].weight);
                break;
            }
        }
        return result;
    }
}
