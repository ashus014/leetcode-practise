package src.DSASheetForDataStructures.SearhingAndSorting.extraQuestionsFromKunal;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Extra4 {
    
    public static void main(String[] args) {
        
        int [] arr = {-18, -12, -4, 0, 2, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start)/2;

            // beacuse mid can be a potential answer, that's why we are taking 
            // end = mid , not, end = mid - 1
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } 
            else {
                start = mid + 1;    
            }
        }
        return start;
    }
}
