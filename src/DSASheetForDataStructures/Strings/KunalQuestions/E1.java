package src.DSASheetForDataStructures.Strings.KunalQuestions;

// https://www.youtube.com/watch?v=gdifkIwCJyg&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=32&ab_channel=KunalKushwaha
// Create a new string with given string with a character.
public class E1 {

    public static void main(String[] args) {
        // String temp = removeACharacter("baccad", 'a');
        System.out.println(removeACharacter2("baccad", 'a'));
        // StringBuilder result = new StringBuilder(temp);
        // System.out.println(result.reverse().toString());
    }

    private static String removeACharacter2(String string, char c) {

        if (string.isEmpty())
            return "";
        if (string.charAt(0) == c)
            return removeACharacter2(string.substring(1), c);
        else
            return string.charAt(0) + removeACharacter2(string.substring(1), c);
    }

    // private static String removeACharacter(String string, char c) {
    // return helper("", string, c, string.length());
    // }

    // private static String helper(String result, String string, char c, int len) {

    // if (len == 0)
    // return result;

    // if (string.charAt(len - 1) == c)
    // return helper(result, string, c, len - 1);
    // else
    // return helper(result + string.charAt(len - 1), string, c, len - 1);
    // }
}
