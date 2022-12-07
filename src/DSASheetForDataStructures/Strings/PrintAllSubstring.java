package src.DSASheetForDataStructures.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllSubstring {

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
}
