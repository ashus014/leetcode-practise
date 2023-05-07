package src.leetCodeProblems;

public class Problem258 {

    public static void main(String[] args) {
        System.out.println(addDigits(2299));

    }

    public static int addDigits(int num) {
        int sumOfDigits = 0;
        while (num/10 != 0) {
            while (num != 0) {
                sumOfDigits += num % 10;
                num /= 10;
            }
            num = sumOfDigits;
            sumOfDigits = 0;
        }
        return num;
    }
}
