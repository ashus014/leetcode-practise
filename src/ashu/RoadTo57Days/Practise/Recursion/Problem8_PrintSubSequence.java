package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;

public class Problem8_PrintSubSequence {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);

        ArrayList<Integer> ds = new ArrayList<>();
        printSubsequence(0, ds, arr, 3);

    }

    private static void printSubsequence(int ind, ArrayList<Integer> ds, ArrayList<Integer> arr, int n) {
        if(ind == n) {
            System.out.println(ds);
            return;
        }
        ds.add(arr.get(ind));
        printSubsequence(ind + 1, ds, arr, n);
        ds.remove(ds.size()-1);
        printSubsequence(ind + 1, ds, arr, n);
    }
}
