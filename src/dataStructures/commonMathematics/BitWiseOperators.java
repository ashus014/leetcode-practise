package src.dataStructures.commonMathematics;

/*
 * Using BitWise Opearations to perform calclations
 */

public class BitWiseOperators {
    
    public static void main(String[] args) {
        
        int []numbers = {1,2,3,4,3,2,1};
        // System.out.println(OddEvenCheck(22));
        // System.out.println(doubleTheElement(22));
        // System.out.println(halfTheElement(22));
        System.out.println(findUnique(numbers));
    }

    // Odd returns True
    private static Boolean OddEvenCheck(int number) {

        return (number & 1) == 1;
    }

    // Double the element
    private static int doubleTheElement(int number) {

        return (number << 1);
    }

    // Half the element
    private static int halfTheElement(int number) {

        return (number >> 1);
    }

    // Find unique elemt in the array which has same double elemets present
    // number XOR with same number gives 0
    // nuumber ^ number = 0
    // number ^ 0 = number
    private static int findUnique(int[] numbers) {

        int unique = 0;

        for(int n : numbers) {
            unique ^= n;
        }
        
        return unique;
    }
 }
