package src.DSASheetForDataStructures.SearhingAndSorting.extraQuestionsFromKunal;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Extra6 {

    public static void main(String[] args) {
        int A[] = {5,6,7,8,9,10,1,2,3};
        int target = 5;
        // System.out.println(findPivot(A));
        int pivot = findPivot(A);

        // this means the aray is not rotated
        if(pivot == -1) {
            BinarySearch(A, target, 0, A.length-1);
        }

        // otherwise we have found two ascending sorted arrays
        if(A[pivot] == target) {
            // pivot is the answer
            System.out.println(pivot);
        }
        if(target >=  A[0]) {
            System.out.println(BinarySearch(A, target, 0, pivot-1));
        } else {
            System.out.println(BinarySearch(A, target, pivot +1, A.length-1));
        }

    }

    static int BinarySearch(int []arr, int target, int s, int e) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // 4 cases over here
            int mid = start + (end - start) / 2;

            // what if [mid + 1] is index of of bound
            // so put one more condition
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if(arr[mid] <= start) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
}
