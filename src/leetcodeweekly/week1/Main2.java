package src.leetcodeweekly.week1;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        System.out.println(sumOfMultiples(9));
    }

    public static int sumOfMultiples(int n) {

        int result = 0;
        for(int i =1; i<=n; i++) {
            if(check(i))
                result += i;
        }
        return result;
    }

    private static boolean check(int number) {
        return (number % 3 == 0 || number % 5 == 0 || number % 7 == 0) ? true : false;
    }
}
