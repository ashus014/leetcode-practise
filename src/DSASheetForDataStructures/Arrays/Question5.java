package src.DSASheetForDataStructures.Arrays;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
public class Question5 {
    
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(arr, 8);
        System.out.println(Arrays.toString(arr));
    }

    static public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int []temp = new int[8];
        int j=0;

        for(int num : arr) {
            if(num > 0) {
                temp[j++] = num; 
            }
        }

        for(int num : arr) {
            if(num < 0) {
                temp[j++] = num; 
            }
        }

        for(int i=0 ;i<n; i++) {
            arr[i] = temp[i];        
        }
    }

}
