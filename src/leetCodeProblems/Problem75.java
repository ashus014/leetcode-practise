package src.leetCodeProblems;

import java.util.Arrays;

public class Problem75 {

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortColors(int[] nums) {
        int[] temp = {0,0,0};

        for(int i=0; i<nums.length; i++) {
            int index = nums[i];
            temp[index]++;
        }
        int j=0;
        for(int i=0; i<temp.length; i++) {
            int number = i;
            int occurences = temp[i];

            for(int k=0; k<occurences; k++) {
                nums[j++] = number;
            }
        }
    }
}
