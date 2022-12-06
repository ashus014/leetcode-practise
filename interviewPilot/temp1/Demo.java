package interviewPilot.temp1;

public class Demo {

    public static void main(String[] args) {

        // Fibonnnaci series
        // 0 1 1 2 3 5 8
        int count = 8;
        printFibonnaci(count);

    }

    private static void printFibonnaci(int count) {

        if (count < 0)
            return;

        int first = 0;
        int second = 1;
        int sum = Integer.MIN_VALUE;
        System.out.print(first + " " + second + " ");

        for (int i = 3; i < count; i++) {
            sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum + " ");
        }
    }
}
