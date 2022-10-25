package src.DSASheetForDataStructures.SearhingAndSorting;

import java.util.Arrays;

public class Question6 {
    public static void main(String[] args) {
        int Arr[] = {1, 3, 3};
        System.out.println(Arrays.toString(findTwoElement2(Arr, Arr.length)));
    }

    public static int[] findTwoElement(int arr[], int n) {
        // code here
        int [] result = new int[2];
        int [] count = new int[n];
        for(int i=0; i<n; i++) {
            count[arr[i]-1]++;
        }        

        for(int i=0; i<n; i++) {
            if(count[i] == 0) {
                result[1] = i+1;
            }
            if(count[i] == 2) {
                result[0] = i+1;
            }
        }

        return result;
    }

    // second approach with O(1) space
    public static int[] findTwoElement2(int arr[], int size) {
        // code here
        int[] result = {0,0};
        
        for(int i=0; i<arr.length; i++) {
            int absValue = Math.abs(arr[i]);

            if(arr[absValue - 1] > 0) {
                arr[absValue - 1] = - arr[absValue - 1];
            }
            else {
                result[0] = absValue;
            }
            
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 0){
                result[1] = i+1;
            }
        }
        return result;
    }
}
