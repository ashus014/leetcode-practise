package src.DSASheetForDataStructures.SearhingAndSorting.extraQuestionsFromKunal;

// Finding ceiling & floor of a number
// ceiling - smallest element in an array that is greater than or equal to target.
// floor - greatest number that is less than or equal to target.
public class Extra1 {
    
    public static void main(String[] args) {
        int [] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.println(ceiling(arr, 17));
        System.out.println(floor(arr, 17));
        
    }

    static public Integer ceiling(int[] arr, int target) {

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
        return arr[start];
    }

    static public Integer floor(int[] arr, int target) {

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
        return arr[end];
    }
}
