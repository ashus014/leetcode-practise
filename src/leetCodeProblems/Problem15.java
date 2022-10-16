package src.leetCodeProblems;
import java.util.*;
public class Problem15 {
    
    public static void main(String[] args) {
        int []nums = {0,0,0};
        System.out.println(threeSum(nums));
    }

    static public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>(); 
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer>  temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }
}
