package src.DSASheetForDataStructures.Strings.KunalQuestions;

import java.util.ArrayList;

// Generate all possible permutations
// abc (3!) = abc, acb, bac, bca, cba, cab
public class E3 {

    public static void main(String[] args) {

        permutations("abc");
    }

    private static void permutations(String str) {
        helper("", str);
    }

    private static void helper(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            helper(first + up.charAt(0) + second, up.substring(1));
        }
    }

}
