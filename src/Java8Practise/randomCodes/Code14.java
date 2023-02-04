package src.Java8Practise.randomCodes;

import java.util.ArrayList;
import java.util.List;

public class Code14 {

    static int SIZE = 26;

    public static void main(String[] args) {

        int num = 702;
        printEquivalentColumn(num);
    }

    public static void printEquivalentColumn(int n) {

        List<Integer> ansInNumber = new ArrayList<>();

        int num = n;
        while (n > 0) {
            if (n / SIZE != 0)
                ansInNumber.add(n / SIZE);
            n /= SIZE;
        }
        ansInNumber.add(num % SIZE);

        // System.out.println((char) ('A' + n - 1));

        System.out.println(ansInNumber);

    }
}
