package src.leetCodeProblems;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem438 {

    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        int[] hash = new int[26];
        int[] pHash = new int[26];
        for (int i = 0; i < p.length(); i++) {
            pHash[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s.length() - p.length(); i++) {

            String subString = s.substring(i, p.length() + i);

            for (int j = 0; j < subString.length(); j++) {
                hash[subString.charAt(j) - 'a']++;
            }

            if (Arrays.equals(hash, pHash))
                result.add(i);

            Arrays.fill(hash, 0);
        }

        return result;
    }
}
