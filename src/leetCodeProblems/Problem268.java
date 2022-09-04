package src.leetCodeProblems;

import java.util.Arrays;

public class Problem268 {
    

    public static void main(String[] args) {
        int []arr = {3,0,1};
        int number = missingNumber(arr);
        System.out.println(number);
    }

    static public int missingNumber(int[] nums) {
        
        int requiredSize = nums.length + 1;
        int[] flagArray = new int[requiredSize];

        for(int i=0; i<flagArray.length; i++) {
            flagArray[i] = 0;
        }

        for(int i=0; i<nums.length; i++) {
            flagArray[nums[i]] = 1;
        }

        for(int i=0; i<flagArray.length; i++) {
            if(flagArray[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
