package src.DSASheetForDataStructures.SearhingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1
public class Question10 {
    

    public static void main(String[] args) {

        int A[] = {1, 4, 45, 6, 10, 12};
        int X = 21;
        System.out.println(fourSum(A, X));
    }

    static public ArrayList<ArrayList<Integer>> fourSum(int[] A, int X) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // code here
        int l,r;
        int n = A.length;
        Arrays.sort(A);
 
        /* Now fix the first 2 elements one by one and find
           the other two elements */
        for (int i = 0; i < n - 3; i++)
        {
            for (int j = i + 1; j < n - 2; j++)
            {
                // Initialize two variables as indexes of the first and last
                // elements in the remaining elements
                l = j + 1;
                r = n - 1;
 
                // To find the remaining two elements, move the index
                // variables (l & r) toward each other.
                while (l < r)
                {
                    if (A[i] + A[j] + A[l] + A[r] == X)
                    {
                        // System.out.println(A[i]+" "+A[j]+" "+A[l]+" "+A[r]);
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(A[i]);
                        temp.add(A[j]);
                        temp.add(A[l]);
                        temp.add(A[r]);
                        result.add(temp);
                        l++;
                        r--;
                    }
                    else if (A[i] + A[j] + A[l] + A[r] < X)
                        l++;
                    else // A[i] + A[j] + A[l] + A[r] > X
                        r--;
                } // end of while
            } // end of inner for loop
        } // end of outer for loop

        return result;
    }
}
