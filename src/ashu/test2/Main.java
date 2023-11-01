package src.ashu.test2;

public class Main {
    public static String longestSubstringWithTwoDistinctChars(String str) {
        int left = 0, right = 0, maxLen = 0, start = 0, distinctCount = 0;
        int[] lastIndex = new int[256]; // Store the last index of each character

        while (right < str.length()) {
            char rightChar = str.charAt(right);
            if (lastIndex[rightChar] == 0) distinctCount++;
            lastIndex[rightChar] = right + 1;

            while (distinctCount > 2) {
                char leftChar = str.charAt(left);
                if (lastIndex[leftChar] == left + 1) distinctCount--;
                left++;
            }
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
            right++;
        }
        return str.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        String str = "neceba";
        String longestSubstr = longestSubstringWithTwoDistinctChars(str);
        System.out.println(longestSubstr); // Output: "ece"
    }
}
