package src.DSASheetForDataStructures.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Question6 {
    
    public static void main(String[] args) {
        

    }

    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<n; i++) {
            set.add(a[i]);
        }

        for(int i=0; i<m; i++) {
            set.add(b[i]);
        }

        return set.size();
    }
}
