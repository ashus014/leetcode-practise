package src.Java8Practise.randomCodes;

import java.util.Arrays;

public class Code7 {

    public static void main(String[] args) {
        String first = "abeeeeecbcfffffffffd";
        String second = "cdeeeeeeefbb";
        String common = commonCharacters(first, second);
        System.out.println("common characters in '" + first + "' and '" + second + "' are '" + common + "'");

    }

    public static String commonCharacters(String a, String b) {

        int[] count = new int[26];
        for (int i = 0; i < a.length(); i++) {
            if (count[a.charAt(i) - 'a'] == 0 || count[a.charAt(i) - 'a'] == 1)
                count[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            if (count[b.charAt(i) - 'a'] == 2 || count[b.charAt(i) - 'a'] == 3)
                count[b.charAt(i) - 'a']++;
        }

        String result = "";

        System.out.println(Arrays.toString(count));

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 4)
                result += (char) (i + 'a');
        }
        return result;
    }
}
