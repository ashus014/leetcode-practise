package src.DSASheetForDataStructures.Strings;

public class Question2 {

    public static void main(String[] args) {

        System.out.println(isPalindrome("abba"));
    }

    static int isPalindrome(String S) {
        StringBuilder stringBuilder = new StringBuilder(S);
        return stringBuilder.reverse().toString().equals(S) ? 1 : 0;
    }
}
