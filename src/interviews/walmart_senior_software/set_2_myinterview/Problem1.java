package src.interviews.walmart_senior_software.set_2_myinterview;

import java.util.Arrays;

// Problem 1 : Find the next greater number using the same digits as the given number.
// For example, if the input is 218765, the program should output 251678,
// which is the next greater number that can be formed using the same digits.

public class Problem1 {

    public static void main(String[] args) {
        String str = "218765"; // 251678
        System.out.println(findNextLargest(str));
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
