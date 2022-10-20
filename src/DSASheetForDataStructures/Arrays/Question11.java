package src.DSASheetForDataStructures.Arrays;

import java.util.ArrayList;
import java.util.List;

// https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
public class Question11 {
    
    public static void main(String[] args) {
        
        int a[] = {2,3,1,2,3};
        System.out.println(duplicates(a, 5));
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        int []temp = new int[n];

        for(int i=0;i <arr.length; i++) {
            temp[arr[i]]++;
        }

        for(int i=0; i<arr.length; i++) {
            if(temp[i] > 1) {
                result.add(i);
            }
        }

        if(result.size() == 0) {
            result.add(-1);
        }

        return result;

    }
}
