package src.leetCodeProblems;

import java.util.Arrays;

class Problem34 {

public static void main(String[] args) {
    int [] arr = {5,7,7,7,7,8,8,10};    
    int target = 7;
    System.out.println(Arrays.toString(searchRange(arr, target)));
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