package src.dataStructures.recursion;

public class RecursionExamples {
    

    public static void main(String[] args) {
        
        // printDescending(5);
        printAscending(5);
    }

    // Print from 5,4,3,2,1
    static void printDescending(int number) {

        if(number == 0)
        {
            return;
        }
        System.out.println(number);
        printDescending(number-1);
    }

    static void printAscending(int number) {

        if(number == 0){
            return;
        }
        System.out.println(number);
        printAscending(number-1);
        System.out.println(number);
    }
}
