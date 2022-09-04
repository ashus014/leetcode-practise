package src.leetCodeProblems;
import java.util.List;
import java.util.ArrayList;

public class Problem442 {
    
    public static void main(String[] args) {
        
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> answer = findDuplicates(arr);
        System.out.println(answer);

    }

    static public List<Integer> findDuplicates(int[] nums) {
        
        cyclicSort(nums);
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i]-1 != i) {
                answer.add(nums[i]);
            }
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
