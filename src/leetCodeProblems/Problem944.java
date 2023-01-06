package src.leetCodeProblems;

import java.util.Arrays;

public class Problem944 {

    public static void main(String[] args) {

        String[] strs = { "zyx", "wvu", "tsr" };
        System.out.println(Arrays.toString(strs));
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {

        int length = strs[0].length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}
