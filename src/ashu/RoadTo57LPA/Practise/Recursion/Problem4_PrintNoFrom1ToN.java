package src.ashu.RoadTo57LPA.Practise.Recursion;

public class Problem4_PrintNoFrom1ToN {

    public static void main(String[] args) {

        printNumbers(3);
    }

    private static void printNumbers(int n) {
        if (n < 1)
            return;
        printNumbers(n - 1);
        System.out.println(n);
    }
}
