package src.DSASheetForDataStructures.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
public class Question4 {
    public static void main(String[] args) {
        int[] a = {0 ,2 ,1 ,2 ,0};
        sort012(a, 5);
    }

    public static void sort012(int a[], int n)
    {
        // code here - 3.21 seconds
        // Arrays.sort(a);
        // for(int i=0; i<n; i++) {
        //     System.out.print(a[i] + " ");
        // }

        //second approach using HashMap
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for(int temp : a) {
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }

        int j =0;
        for(int i=0; i< hashMap.get(0); i++) {
            a[j++] = 0;
        }
        for(int i=0; i< hashMap.get(1); i++) {
            a[j++] = 1;
        }
        for(int i=0; i< hashMap.get(2); i++) {
            a[j++] = 2;
        }

        System.out.println(Arrays.toString(a));
    }
}
