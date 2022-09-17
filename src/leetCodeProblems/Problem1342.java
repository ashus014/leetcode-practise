package src.leetCodeProblems;

public class Problem1342 {
    
    public static void main(String[] args) {
        
        System.out.println(numberOfSteps(8));
    }

    static public int numberOfSteps(int num) {
        
        return helperMethod(num, 0);
    }

    private static int helperMethod(int num, int steps) {
        
        if(num == 0) {
            return steps;
        }

        int rem = num % 2;

        if(rem == 0){
            return helperMethod(num/2, steps+1);
        }
        return helperMethod(num-1, steps+1);
    }
}
