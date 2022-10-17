package src.DSASheetForDataStructures.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/reverse-an-array/0
// Question - 1
public class Question1 {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            while(n > 0) {
                
                int tot = scan.nextInt();
                Integer []arr = new Integer[tot];
                for(int i=0; i<tot; i++) {
                    arr[i] = scan.nextInt();
                }
                
                Collections.reverse(Arrays.asList(arr)); 
                
                for(int i=0; i<tot; i++) {
                    System.out.print(arr[i] + " ");
                }
                
                System.out.println();
                n--;
            }
        }
    }
}
