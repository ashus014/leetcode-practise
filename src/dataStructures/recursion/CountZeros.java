package src.dataStructures.recursion;

public class CountZeros {
    

    public static void main(String[] args) {
        
        System.out.println(countZeros(210013));
    }

    private static int countZeros(int number) {
        int countOfZero = 0;
        return helperMethod(number, countOfZero);
    }

    private static int helperMethod(int number, int countOfZero) {
    
        if(number == 0) {
            return countOfZero;
        }

        int rem = number % 10;

        if (rem == 0)  {
            return helperMethod(number/10, countOfZero+1);
        }
        return helperMethod(number/10, countOfZero);
    }

    /* *
    * Weird way to solve the above problem

    private static int helperMethod(int number, int countOfZero) {
    
        if(number == 0) {
            return 0;
        }

        int rem = number % 10;

        if (rem == 0)  {
            countOfZero++;
        }
        return countOfZero + helperMethod(number/10, 0);
    }
    */
}
