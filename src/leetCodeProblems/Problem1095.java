package src.leetCodeProblems;

public class Problem1095 {
    public static void main(String[] args) {
        int []arr = {0,1,2,4,2,1};
        int target = 4;
        System.out.println(findInMountainArray(target ,arr));
    }

    // static public int findInMountainArray(int target, MountainArray mountainArr) {
    static public int findInMountainArray(int target, int []arr) {
        int indexOfMountainTop = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, indexOfMountainTop);
        if(firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        int secondTry = orderAgnosticBinarySearch(arr, target, indexOfMountainTop, arr.length-1);
        if(secondTry != -1) {
            return firstTry;
        }
        return -1;
    }

    // Finding the largest element in an array code with log(n) time complexity
    static public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } 
            else {
                start = mid + 1;    
            }
        }
        return start;
    }

    //order agnostic Binary Search
    static int orderAgnosticBinarySearch(int arr[], int target, int start, int end) {

        //find whether the array is sorted in Ascending or Descending
        boolean isAscending = arr[start] < arr[end];


        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2;
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
