package src.leetCodeProblems;

import java.util.*;

public class Problem1431 {

    public static void main(String[] args) {

        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int maxGivenCandy = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<>();

        for (int i=0 ; i<candies.length; i++) {
            if(candies[i] > maxGivenCandy) {
                maxGivenCandy = candies[i];
            }
        }

        for (int i=0 ; i<candies.length; i++) {
           if (candies[i] + extraCandies >= maxGivenCandy)
               result.add(true);
           else
               result.add(false);
        }
        return result;
    }
}
