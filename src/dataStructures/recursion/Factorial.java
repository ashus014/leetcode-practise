package src.dataStructures.recursion;

public class Factorial {
    public static void main(String[] args) {
        
        // System.out.println(factorial(5));
        System.out.println(sumOfNumbers(1234));

    }

    // Factorial of a Number
    public static int factorial(int number) {
        
        if(number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    // Sum of Digits
    public static int sumOfNumbers(int number) {

        if (number == 0) {
            return 0;
        }
        return (number % 10) + sumOfNumbers(number / 10);
    }
}
