package src.DSASheetForDataStructures.Strings;

// https://practice.geeksforgeeks.org/problems/reverse-a-string/1
public class Question1 {

    public static void main(String[] args) {

        System.out.println(reverseWord("ashu"));
    }

    public static String reverseWord(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }
}
