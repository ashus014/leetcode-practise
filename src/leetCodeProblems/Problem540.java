package src.leetCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class Problem540 {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums));

    }

    public static int singleNonDuplicate(int[] nums) {
        int result = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
            if (temp.getValue() == 1) {
                result = temp.getKey();
            }
        }

        return result;
    }
}
