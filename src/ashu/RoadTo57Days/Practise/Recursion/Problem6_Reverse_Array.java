package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.Arrays;

public class Problem6_Reverse_Array {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        reverseArray(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, Integer left, Integer right) {

        if(left >= right) {
            return;
        }
        swapElements(arr, left, right);
        reverseArray(arr, left + 1, right - 1);
    }

    private static void swapElements(int[] arr, Integer left, Integer right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
