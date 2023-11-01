package src.ashu.test2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Random {

    public static void main(String[] args) {

        String str = "218765"; // 251678
        System.out.println(findNextLargest(str));

//        // Global =
//        String str = "eceba";
//        int THRESHHOLD = 2;
//        Set<Character> set = new HashSet<>(); // size = 2
//
//        // v,e,c,e,b,a
//
//        // e,e,e,e,e
//
//
//        String finalResult = "";
//        StringBuilder temp = new StringBuilder();
//
//
//        for(int i=0; i<str.length(); i++) {
//
//            if(set.size() <= THRESHHOLD) {
//                temp.append(str.charAt(i));
//                set.add(str.charAt(i));
//            }
//
//            if(temp.length() > finalResult.length()) {
//                finalResult = temp.toString();
//            }
//
//        }
//
//
//        System.out.println(finalResult);
//        // temp = {e,c,e}
//        //
    }


    private static String findNextLargest(String str) {

        int lastNumber = Integer.parseInt(String.valueOf(str.charAt(str.length() - 1)));
        int i = str.length() - 2;
        while (lastNumber < Integer.parseInt(String.valueOf(str.charAt(i)))) i--;
        str = swapCharacters(str, str.length() - 1, i);
        str = sortCharacters(str, i, str.length() - 1);
        return str;
    }

    private static String swapCharacters(String str, int index1, int index2) {
        char[] charArray = str.toCharArray();
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
        return new String(charArray);
    }

    private static String sortCharacters(String str, int index1, int index2) {
        String str1 = str.substring(0, index1 + 1);
        String str2 = str.substring(index1 + 1, index2 + 1);
        char[] charArray = str2.toCharArray();
        Arrays.sort(charArray);
        str2 = new String(charArray);
        return str1 + str2;
    }



}
