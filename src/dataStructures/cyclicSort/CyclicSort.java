package src.dataStructures.cyclicSort;

import java.util.Arrays;

// When given range from 1 to n always use Cyclic Sort.
public class CyclicSort {

    public static void main(String[] args) {
        
        int []arr = {3,5,2,1,4};
        int i=0;

        while(i<arr.length) {
            if(arr[i]-1 != i) {
                swap(arr, i, arr[i]-1);
            }
            else {
                i++;
            }
        }

        Arrays.stream(arr)
                    .forEach(x -> System.out.print(x + "-"));

        // System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int firstNumberIndex, int secondNumberIndex) {

        int temp = arr[firstNumberIndex];
        arr[firstNumberIndex] = arr[secondNumberIndex];
        arr[secondNumberIndex] = temp;
    }
    
}
