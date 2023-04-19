package src.leetCodeProblems;

public class Problem121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {2,4,1}));
    }

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int maxProfit = 0;
        int n = prices.length;

        for (int i=1; i<n; i++) {
            int cost = prices[i] - min;
            maxProfit = Math.max(maxProfit, cost);
            min = Math.min(min, prices[i]);
        }

        return maxProfit;
    }
}
