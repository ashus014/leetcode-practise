package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Problem21_Palindrome_Partitioning {
    public static void main(String[] args) {

        String s = "aabb";
        System.out.println(partition(s));
    }

    private static List<List<String>> partition(String s) {
        int START_INDEX = 0;
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        func(START_INDEX, s, ds, res);
        return res;
    }

    private static void func(int index, String s, List<String> ds, List<List<String>> res) {

        if (index == s.length()) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                ds.add(s.substring(index, i + 1));
                func(i + 1, s, ds, res);
                ds.remove(ds.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}