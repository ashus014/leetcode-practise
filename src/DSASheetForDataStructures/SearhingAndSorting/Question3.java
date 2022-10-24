package src.DSASheetForDataStructures.SearhingAndSorting;

public class Question3 {
    
    public static void main(String[] args) {
        
        int A[] = {5,6,7,8,9,10,1,2,3};
        System.out.println(Search(A, 10));
    }

    static int Search(int array[], int target)
	{
	    // code here
	    int pivot = findPivot(array);
	    // this means the aray is not rotated
        if(pivot == -1) {
            return BinarySearch(array, target, 0, array.length-1);
        }

        // otherwise we have found two ascending sorted arrays
        if(array[pivot] == target) {
            // pivot is the answer
            return pivot;
        }
        if(target >=  array[0]) {
            return BinarySearch(array, target, 0, pivot-1);
        } else {
            return BinarySearch(array, target, pivot +1, array.length-1);
        }

	}

    static int BinarySearch(int []arr, int target, int s, int e) {
        int start = s;
        int end = e;

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
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
