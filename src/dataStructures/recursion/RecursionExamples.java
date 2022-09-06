package src.dataStructures.recursion;

public class RecursionExamples {
    

    public static void main(String[] args) {
        
        printNUmbers(1);

    }

    static void printNUmbers(int number) {

        if(number > 5)
        {
            return;
        }
        System.out.println(number + " - ");
        printNUmbers(number+1);
    }
}
