package src.ashu.arrayOperations;

import java.util.*;
import java.util.HashSet;

public class Problem1 {


    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 3, 3, 4, 5};
        int[] arr2 = {2, 3, 3, 4, 4, 5};

//        System.out.println("The union of two arrays :: " + findUnionOfArrays(arr1, arr2));
        System.out.println("The intersection of two arrays :: " + findIntersectionOfArrays(arr1, arr2));


    }

    private static List<Integer> findUnionOfArrays(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (result.isEmpty() || (result.get(result.size() - 1) != arr1[i])) {
                    result.add(arr1[i]);
                }
                i++;
            } else {
                if (result.isEmpty() || (result.get(result.size() - 1) != arr2[j])) {
                    result.add(arr2[j]);
                }
                j++;
            }
        }

        while (j < arr2.length) {
            if (result.isEmpty() || (result.get(result.size() - 1) != arr2[j])) {
                result.add(arr2[j]);
            }
            j++;
        }

        while (i < arr1.length) {
            if (result.isEmpty() || (result.get(result.size() - 1) != arr1[i])) {
                result.add(arr1[i]);
            }
            i++;
        }

        return result;
    }

    private static List<Integer> findIntersectionOfArrays(int[] a, int[] b) {
        List<Integer> result = new ArrayList<>();

        int aLength = a.length;
        int bLength = b.length;
        int i = 0, j = 0;

        while(i < aLength && j < bLength) {

            if(a[i] == b[j]){
                result.add(a[i]);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return result;
    }
}
