package src.leetCodeProblems;

public class Problem17 {
    public static void main(String[] args) {
        


        letterCombinations("23");
    }

    public static void letterCombinations(String digits) {
        
        String ans = "";
        String[] mapping = {"","abc","def","ghi","jkl","mno","prqs","tuv","wxyz"};

        for(int i=0;i<digits.length();i++) {
            ans += mapping[(digits.charAt(i) - '0')-1];
        }

        System.out.println(ans);
    }

    public static void pad(String p, String up) {

       
    }


}
