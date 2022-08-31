package src.dataStructures.binarySearch;

public class BiraryClass {

    public static void main(String[] args) {
        int arr[] = {-2, -1, 4, 6, 7, 9, 11, 34, 56, 78, 89, 111};
        System.out.println(binarySearch(arr, 111));
    }

    static  int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2;
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
           }else {
                return mid;
            }
        }

        return -1;
    }

    //order agnostic Binary Search
    static int orderAgnosticBinarySearch(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

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
