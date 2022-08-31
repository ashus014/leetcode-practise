package src.leetCodeProblems;

public class Day003 {

    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n < 3)
            return false;

        while(n !=1){
            if(n%3!=0){
                return false;
            }
            n=n/4;
        }
        return true;
    }

    public static void main(String[] args) {
        Day003 ashu = new Day003();
        System.out.println(ashu.isPowerOfThree(27));
    }
}
