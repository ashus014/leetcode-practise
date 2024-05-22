package src.ashu.arrayOperations;

import java.util.*;

public class Problem5 {

    public static void main(String[] args) {


//        Problem statement : Print Longest substring without repeating characters
//        Input : GEEKSFORGEEKS
//        Output : EKSFORG
//        Input : ABDEFGABEF
//        Output : BDEFGA

        // G, E ,E , K, S, F, O, R, G, E, E, K, S
        // Cache = {E,K,S};
        // LengthOfLongestSubStringVisitedSoFar = 3
        // LognestSubStringFoundSoFar = E , K, S, F, O, R, G

        String string = "GEEKSFORGEEKS";
        System.out.println("Longest Substring without repeating character :: " + longestSubStringWithOut(string));
    }

    private static String longestSubStringWithOut(String str) {

        String result = "";
        int lengthOfLongestSubStringVisitedSoFar = 0;
        String longestSubStringFoundSoFar = "";
        Set<Character> cache = new HashSet<>();

        // O(n) -> str.length
        for(int i =0 ; i < str.length(); i++) {
            // o(n)
            if(cache.contains(str.charAt(i))) {

                if(longestSubStringFoundSoFar.length() > cache.size()) {

                    // O(n)
                    for(int j = 0; j< cache.size(); j++) {
//                        longestSubStringFoundSoFar += cache.get(j);
                    }
                }
                lengthOfLongestSubStringVisitedSoFar = 0;
//                cache.removeAll();
            }
        }



        return result;

    }



}
