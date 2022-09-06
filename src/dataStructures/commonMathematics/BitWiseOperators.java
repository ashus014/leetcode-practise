package src.dataStructures.commonMathematics;

public class BitWiseOperators {
    
    public static void main(String[] args) {
        
        System.out.println(OddEvenCheck(22));
    }

    // Odd returns True
    private static Boolean OddEvenCheck(int number) {

        return (number & 1) == 1;
    }
 }
