package src.dataStructures.bubbleSort;

import java.util.Arrays;

class MainBubbleSort {

    public static void main(String[] args) {
        // int []arr = {-4,-1,1,3,4,2,7,9};
        int []arr = {1,2,3,4,5,6,7,8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {

        boolean swapped  = false;
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }
}