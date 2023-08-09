package src.ashu.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        String s1 = "aaoaoo";
        //String s2 = "rryryy";
        String s2 = "rrryyy";
        // array1 : store instances of

        if(s1.length() != s2.length())
            System.out.println("Not Isomorphic");

//        int[] diffStore = new int[s1.length()];
//
//        for(int i=0 ;i<s1.length(); i++ ) {
//            diffStore[i] = s1.charAt(i) - s2.charAt(i);
//        }
//
//        System.out.println(Arrays.toString(diffStore));

        Map<Character, Character> map = new HashMap<>();
        for(int i=0 ;i<s1.length(); i++ ) {
            map.put(s1.charAt(i), s2.charAt(i));
        }

        System.out.println(map);







    }
}
