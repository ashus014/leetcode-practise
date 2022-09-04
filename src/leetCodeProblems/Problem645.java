package src.leetCodeProblems;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem645 {
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,2,4};
        int[] result = findErrorNums(arr);
        System.out.println(Arrays.toString(result));
    }

    static public int[] findErrorNums(int[] nums) {
        
        // cyclicSort(nums);
        // int[] answer = new int[nums.length-1];
        // for(int i=0, j=0; i<nums.length; i++) {
        //     if(nums[i]-1 != i) {
        //         answer[j++] = nums[i];
        //         answer[j++] = i+1;
        //     }
        // }
        // return answer;

        cyclicSort(nums);
        List<Integer> tempAnswer = new ArrayList<>();
        for(int i=0, j=0; i<nums.length; i++) {
            if(nums[i]-1 != i) {
                tempAnswer.add(nums[i]);
                tempAnswer.add(i+1);
            }
        }
        int[] answer = new int[tempAnswer.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = tempAnswer.get(i);
        }
        return answer;
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        while(i<arr.length) {
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int firstNumberIndex, int secondNumberIndex) {
        int temp = arr[firstNumberIndex];
        arr[firstNumberIndex] = arr[secondNumberIndex];
        arr[secondNumberIndex] = temp;
    }  
}
