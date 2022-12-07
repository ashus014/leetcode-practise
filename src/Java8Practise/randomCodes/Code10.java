package src.Java8Practise.randomCodes;

import java.util.ArrayList;
import java.util.Collections;

public class Code10 {

    public static void main(String[] args) {
        String ashu = "klrwqaozmixrpifeffeclhbv fukbyeqfqojwtwosileeztxwjl";
        // ArrayList<String> result = subsequence("", ashu);
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < ashu.length(); i++) {
            String subStr = "";
            // Second loop is generating sub-String
            for (int j = i; j < ashu.length(); j++) {
                subStr += ashu.charAt(j);
                result.add(subStr);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }

    private static ArrayList<String> subsequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subsequence(p + ch, up.substring(1));
        ArrayList<String> right = subsequence(p, up.substring(1));

        left.addAll(right);
        return left;
    }

}
