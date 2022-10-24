package src.DSASheetForDataStructures.SearhingAndSorting.extraQuestionsFromKunal;


// https://leetcode.com/problems/find-in-mountain-array/
public class Extra5 {
    
    // static public int findInMountainArray(int target, MountainArray mountainArr) {
    //     int indexOfMountainTop = peakIndexInMountainArray(mountainArr);
    //     int firstTry = orderAgnosticBinarySearch(mountainArr, target, 0, indexOfMountainTop);
    //     if(firstTry != -1) {
    //         return firstTry;
    //     }
    //     // try to search in second half
    //     return orderAgnosticBinarySearch(mountainArr, target, indexOfMountainTop+1, mountainArr.length()-1);
    // }

    // // Finding the largest element in an array code with log(n) time complexity
    // static public int peakIndexInMountainArray(MountainArray mountainArr) {
        
    //     int start = 0;
    //     int end = mountainArr.length() - 1;

    //     while(start < end) {
    //         int mid = start + (end - start)/2;

    //         if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
    //             end = mid;
    //         } 
    //         else {
    //             start = mid + 1;    
    //         }
    //     }
    //     return start;
    // }

    // //order agnostic Binary Search
    // static int orderAgnosticBinarySearch(MountainArray mountainArr, int target, int start, int end) {

    //     //find whether the array is sorted in Ascending or Descending
    //     boolean isAscending = mountainArr.get(start) < mountainArr.get(end);


    //     while (start <= end) {
    //         //find the middle element
    //         //int mid = (start + end) / 2;
    //         int mid = start + (end - start)/2;

    //         if (mountainArr.get(mid) == target) {
    //             return mid;
    //         }

    //         if (isAscending) {
    //             if(target < mountainArr.get(mid)){
    //                 end = mid - 1;
    //             }
    //             else {
    //                 start = mid + 1;
    //             }
    //         } else {
    //             if(target > mountainArr.get(mid)){
    //                 end = mid - 1;
    //             }
    //             else {
    //                 start = mid + 1;
    //             }
    //         }
    //     }
    //     return -1;
    // }
}
