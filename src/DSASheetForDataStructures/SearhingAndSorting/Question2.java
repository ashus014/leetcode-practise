package src.DSASheetForDataStructures.SearhingAndSorting;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/value-equal-to-index-value1330/1
public class Question2 {
    
    public static void main(String[] args) {
        
        int [] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(valueEqualToIndex(arr, arr.length));
    }

    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==i+1){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
