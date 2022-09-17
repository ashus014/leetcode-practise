package src.dataStructures.recursion;

public class Factorial {
    public static void main(String[] args) {
        
        // System.out.println(factorial(5));
        // System.out.println(reverseNumber(1234));

        //Find total number of Digits
        int totalNumberOfDigits = (int) (Math.log10(1234)+ 1);
        // System.out.println(totalNumberOfDigits);

        System.out.println(12 * (int)Math.pow(10, 2));

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

    // Reverse a number
    public static int reverseNumber(int number) {

        if (number % 10 == number) {
            return number;
        }

        int temp = number % 10;
        return  10*temp + reverseNumber(number / 10);
    }


}
