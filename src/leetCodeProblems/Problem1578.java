package src.leetCodeProblems;

import java.security.DrbgParameters.Reseed;

public class Problem1578 {
    
    public static void main(String[] args) {
        
        String colors = "aaabbbabbbb";
        int []neededTime = {3,5,10,7,5,3,5,5,4,8,1};
        System.out.println(minCost(colors, neededTime));

    }

    static public int minCost(String colors, int[] neededTime) {
        
        int result;
        char[] tempStart = colors.toCharArray();
        int sum = tempStart[0];
        int max = neededTime[0];

        for(int i=0; i<tempStart.length; i++) {

            if(tempStart[i] == tempStart[i+1]) {
                sum += tempStart[i+1];
                max = Integer.max(max, i+1);
                continue;
            }
            result = sum - max;
        }
    }

    static public int helper(int start, int end, int[] neededTime) {
        if (start == end)
            return 0;
        int max = 0;
        int sum  = 0;

        for(int i = start; i <  end ; i++) {
            int temp = Integer.max(neededTime[i], neededTime[i + 1]);
            max = Integer.max(max, temp);
        }
        for(int i = start; i <=  end ; i++) {
            sum += neededTime[i];
        }

        return sum - max;
    }

}

