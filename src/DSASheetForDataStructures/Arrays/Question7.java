package src.DSASheetForDataStructures.Arrays;

import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    static public void rotate(int arr[], int n)
    {
        int temp = arr[arr.length - 1];
        for(int j=arr.length-1; j > 0; j--) {
            arr[j] = arr[j-1];
        }
        arr[0] = temp;
    }
}
