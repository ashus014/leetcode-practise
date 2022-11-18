package src.Java8Practise.randomCodes;

public class Code4 {

    public static void main(String[] args) {

        String s1 = "ashu", s2 = "asu";
        System.out.println(LCS(s1, s2, s1.length(), s2.length()));
    }

    public static Integer LCS(String s1, String s2, int m, int n) {

        if (m == 0 || n == 0)
            return 0;
        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return 1 + LCS(s1, s2, m - 1, n - 1);
        else
            return Math.max(LCS(s1, s2, m - 1, n), LCS(s1, s2, m, n - 1));
    }
}
