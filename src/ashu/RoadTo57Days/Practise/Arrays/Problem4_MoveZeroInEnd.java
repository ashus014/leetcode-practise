package src.ashu.RoadTo57Days.Practise.Arrays;

import java.util.Arrays;

public class Problem4_MoveZeroInEnd {

    public static void main(String[] args) {

        int[] arr = {0,1,2,4,0,6,7,0,8};
        int n = arr.length;

        int j = -1;
        for(int i = 0; i< n; i++) {
            if(arr[i] == 0) {
                j = i;
                break;
            }
        }

        if(j == -1)
            System.out.println("No zero found bro!");

        for(int i = j + 1; i < n ; i++) {
            if(arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
