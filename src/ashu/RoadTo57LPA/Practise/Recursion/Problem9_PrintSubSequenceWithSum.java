package src.ashu.RoadTo57LPA.Practise.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem9_PrintSubSequenceWithSum {

    public static void main(String[] args) {

        int printSubsequenceCount = printSubsequenceCount(0,
                new ArrayList<>(Arrays.asList(1, 2, 1)),
                3,
                2,
                0);
        System.out.println(printSubsequenceCount);
    }

    private static void printSubsequenceSum(int ind, ArrayList<Integer> ds, ArrayList<Integer> arr, int n, int sum,int s) {
        if(ind == n) {
            if(s == sum) {
                System.out.println(ds);
            }
            return;
        }
        ds.add(arr.get(ind));
        s += arr.get(ind);
        printSubsequenceSum(ind + 1, ds, arr, n, sum, s);
        ds.remove(ds.size()-1);
        s -= arr.get(ind);
        printSubsequenceSum(ind + 1, ds, arr, n, sum, s);
    }

    private static int printSubsequenceCount(int ind,
                                                ArrayList<Integer> arr,
                                                int n,
                                                int sum,
                                                int s) {
        if(ind == n) {
            // condition satisfied
            if(s == sum) {
                return 1;
            }
            // condition not satisfied
            return 0;
        }
        s += arr.get(ind);
        int l = printSubsequenceCount(ind + 1, arr, n, sum, s);
        s -= arr.get(ind);
        int r = printSubsequenceCount(ind + 1, arr, n, sum, s);

        return l + r;
    }

    private static boolean printSubsequenceSumOnce(int ind,
                                                   ArrayList<Integer> ds,
                                                   ArrayList<Integer> arr,
                                                   int n,
                                                   int sum,
                                                   int s) {
        if(ind == n) {
            // condition satisfied
            if(s == sum) {
                System.out.println(ds);
                return true;
            }
            // condition not satisfied
            return false;
        }
        ds.add(arr.get(ind));
        s += arr.get(ind);
        if(printSubsequenceSumOnce(ind + 1, ds, arr, n, sum, s))
            return true;
        ds.remove(ds.size()-1);
        s -= arr.get(ind);
        if(printSubsequenceSumOnce(ind + 1, ds, arr, n, sum, s))
            return true;
        return false;
    }
}
