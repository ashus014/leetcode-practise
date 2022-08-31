package src.leetCodeProblems;

public class Day001 {

    public boolean isPowerOfFour(int n) {
        while(n !=1){
            if(n%4!=0){
                return false;
            }
            n=n/4;
        }
        return true;
    }

    public static void main(String[] args) {

        Day001 ashu = new Day001();
        System.out.println(ashu.isPowerOfFour(64));
    }
}
