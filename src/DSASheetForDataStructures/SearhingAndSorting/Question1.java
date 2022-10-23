package src.DSASheetForDataStructures.SearhingAndSorting;

import java.util.ArrayList;

public class Question1 {
    
    public static void main(String[] args) {
        
        long[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(find(arr, arr.length, 5));
    }

    static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == x && i < min) {
                min = i;
            }
            if(arr[i] == x && i > max) {
                max = i;
            }
        }

        if(min == Integer.MAX_VALUE)    
            min = -1;
        if(max == Integer.MIN_VALUE)    
            max = -1;
        result.add(Long.valueOf(min));
        result.add(Long.valueOf(max));
        return result;

    }
}
