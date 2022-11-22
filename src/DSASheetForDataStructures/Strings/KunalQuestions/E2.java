package src.DSASheetForDataStructures.Strings.KunalQuestions;

import java.util.ArrayList;

// Generate all possible subsequence of a string
public class E2 {

    public static void main(String[] args) {

        System.out.println(generateSubSets("abc"));
    }

    private static ArrayList<String> generateSubSets(String string) {
        // ArrayList<String> result = new ArrayList<>();
        return helper("", string);
    }

    // private static void helper(String processed, String unprocessed) {
    // if (unprocessed.isEmpty()) {
    // System.out.println(processed);
    // return;
    // }

    // helper(processed + unprocessed.charAt(0), unprocessed.substring(1));
    // helper(processed, unprocessed.substring(1));
    // }

    // returning result as ArrayList
    private static ArrayList<String> helper(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> left = helper(processed + unprocessed.charAt(0),
                unprocessed.substring(1));
        ArrayList<String> right = helper(processed, unprocessed.substring(1));
        left.addAll(right);
        return left;
    }

    // private static ArrayList<String> helper(String processed, String unprocessed,
    // ArrayList<String> resulList) {
    // if (unprocessed.isEmpty()) {
    // resulList.add(processed);
    // return resulList;
    // }

    // resulList = helper(processed + unprocessed.charAt(0),
    // unprocessed.substring(1), resulList);
    // resulList = helper(processed, unprocessed.substring(1), resulList);
    // return resulList;
    // }

}
