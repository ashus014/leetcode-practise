package src.leetCodeProblems;

import java.util.Arrays;

public class Problem1833 {

    public static void main(String[] args) {

        // int[] costs = { 1, 3, 2, 4, 1 };
        int[] costs = { 10, 6, 8, 7, 7, 8 };
        int coins = 5;
        System.out.println(maxIceCream(costs, coins));
    }

    public static int maxIceCream(int[] costs, int coins) {

        int result = 0;
        Arrays.sort(costs);
        for (int currentIceCreamCost : costs) {
            if (currentIceCreamCost <= coins) {
                result += 1;
                coins -= currentIceCreamCost;
            }
        }
        return result;
    }
}
