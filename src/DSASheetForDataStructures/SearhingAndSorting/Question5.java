package src.DSASheetForDataStructures.SearhingAndSorting;

// https://practice.geeksforgeeks.org/problems/middle-of-three2926/1
public class Question5 {
    
    public static void main(String[] args) {
        
        System.out.println(middle(45, 34, 51));
    }

    public static int middle(int A, int B, int C){
        //code here
        int min = Math.min(A, Math.min(B, C));
        int max = Math.max(A, Math.max(B, C));
        return ((A + B + C) - (min + max));
    }
}
