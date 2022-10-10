package src.leetCodeProblems.LinkedlListProblems;

public class Problem202 {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
        
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);
        
        if(slow ==1)
                return true;
        else 
            return false;
    }
    
    private int findSquare(int num) {
        int result = 0;
        while(num > 0) {
            int temp = num % 10;
            result += temp * temp;
            num = num / 10;
        }
        return result;
    }
}
