package src.dataStructures.recursion;

public class RecursionExamples {
    

    public static void main(String[] args) {
        
        printNUmbers(5);

    }

    static void printNUmbers(int number) {

        if(number == 0)
        {
            return;
        }
        System.out.println(number);
        printNUmbers(number-1);
    }
}
