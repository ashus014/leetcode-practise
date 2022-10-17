package src.DSASheetForDataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

// https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
public class Question3 {
 

    public static void main(String[] args) {
        
    }

    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Set<Integer> set = new TreeSet<>();
        for(int temp : arr) {
            set.add(temp);
        }

        ArrayList<Integer> arrayList = new ArrayList<>(set);

        return arrayList.get(k-1);
        } 
}
