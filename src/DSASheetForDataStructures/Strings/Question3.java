package src.DSASheetForDataStructures.Strings;

import java.util.HashMap;
import java.util.Map;

// https://www.geeksforgeeks.org/dsa-sheet-by-love-babbar/?ref=sh#Arrays
// Find Duplicate characters in a string

public class Question3 {

    private static final String Map = null;

    public static void main(String[] args) {

        System.out.println(findDuplicateCharacters("abbacceed"));
    }

    private static String findDuplicateCharacters(String string) {

        String result = "";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            map.put(string.charAt(i), map.getOrDefault(string.charAt(i), 0) + 1);
        }

        // Check count and return as string
        for (Map.Entry<Character, Integer> me : map.entrySet()) {
            if (me.getValue() > 1) {
                result += me.getKey();
            }
        }

        return result;
    }
}
