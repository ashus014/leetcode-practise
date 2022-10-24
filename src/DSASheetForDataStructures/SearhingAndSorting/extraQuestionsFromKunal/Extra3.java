package src.DSASheetForDataStructures.SearhingAndSorting.extraQuestionsFromKunal;

import java.util.Arrays;

public class Extra3 {
    
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {

        int [] arr = {-18, -12, -4, 0, 2, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.println(Arrays.toString(searchRange(arr, 2)));

    }

    static public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findAnswer(nums, target, true);
        result[1] = findAnswer(nums, target, false);
        return result;
    }
    
    static int findAnswer(int []arr, int target, boolean areYouFindingOnLeftSide) {

    int ans = -1;
    int start = 0;
    int end = arr.length - 1;

    while(start <= end) {
        int mid = start + (end - start)/2;

        if(target < arr[mid]) {
            end = mid - 1;
        } else if(target > arr[mid]){
            start = mid + 1;
        }
        else {
            ans = mid;
            if(areYouFindingOnLeftSide) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
    }
    return ans;
}

}
