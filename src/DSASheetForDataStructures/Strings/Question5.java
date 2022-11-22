package src.DSASheetForDataStructures.Strings;

// https://practice.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1
// Check if strings are rotations of each other or not
public class Question5 {

    public static void main(String[] args) {

        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.println(areRotations(s1, s2));
    }

    // Create a temp string and store concatenation of str1 to str1 in temp, i.e
    // temp = str1.str1
    // If str2 is a substring of temp then str1 and str2 are rotations of each
    // other.
    public static boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        return (s1 + s1).contains(s2) ? true : false;
    }
}
