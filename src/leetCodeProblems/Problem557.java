package src.leetCodeProblems;

import java.util.Arrays;

public class Problem557 {
    
    public static void main(String[] args) {
        
        System.out.println(reverseWords("Let's take LeetCode contest"));
        // expected - s'teL ekat edoCteeL tsetnoc
        //            s'teL ekat edoCteeL tsetnoc
    }

    public static String reverseWords(String s) {
        
        String realAnswer = "";
        String[] str = s.split(" ");
        StringBuilder[] sbs = new StringBuilder[str.length];
        Arrays.setAll(sbs, i -> new StringBuilder(str[i]));
        
        for(int i=0;i<str.length;i++) {

            if(i != str.length-1) {
                realAnswer+=sbs[i].reverse() + " ";
            }
            if(i == str.length-1) {
                realAnswer+=sbs[i].reverse();
            }

        }
        return realAnswer;
    }
}
