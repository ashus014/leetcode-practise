package src.Java8Practise.randomCodes;

import java.util.ArrayList;

// Generate all possible subsequence of a string
public class Code5 {

    public static void main(String[] args) {

        System.out.println(generateAllPossibleSubSequence("abc"));
    }

    private static ArrayList<String> generateAllPossibleSubSequence(String str) {
        return helper("", str);
    }

    private static ArrayList<String> helper(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }

        ArrayList<String> left = helper(p + up.charAt(0), up.substring(1));
        ArrayList<String> right = helper(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
