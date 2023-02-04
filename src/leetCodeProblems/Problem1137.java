package src.leetCodeProblems;

public class Problem1137 {

    public static void main(String[] args) {

        System.out.println(tribonacci(3));

    }

    public static int tribonacci(int n) {
        int result = 0;

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;

        int num1 = 0, num2 = 1, num3 = 1;

        for (int i = 3; i <= n; i++) {
            result = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = result;
        }

        return result;
    }
}
