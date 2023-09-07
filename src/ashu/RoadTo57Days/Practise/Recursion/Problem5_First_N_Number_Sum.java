package src.ashu.RoadTo57Days.Practise.Recursion;

public class Problem5_First_N_Number_Sum {

    public static void main(String[] args) {
        printSum(5, 0);
        System.out.println(printSumFunctional(5));;
    }

    private static void printSum(int num, int totalSum) {
        if(num < 1) {
            System.out.println(totalSum);
            return;
        }
        printSum(num - 1, totalSum + num);
    }

    private static int printSumFunctional(int num) {
        if(num < 1) return 0;
        return num + printSumFunctional(num - 1);
    }
}
